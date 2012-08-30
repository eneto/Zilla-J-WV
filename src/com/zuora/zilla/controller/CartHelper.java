package com.zuora.zilla.controller;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import com.zuora.zilla.model.*;

/**
 * This class represents the cart, where the user can add/remove products to his
 * future subscription.
 * 
 * @author Mickael Pham <mickael.pham@zuora.com>
 */
public class CartHelper {

	/**
	 * A list of cart item models that each store a rate plan to be displayed to
	 * the user.
	 */
	@JsonProperty("cart_items")
	private List<CartItem> cartItems;

	/**
	 * A tally of cart items used to generate a unique cart id for each item
	 * added.
	 */
	private Integer latestItemId;

	/**
	 * Initialize an empty cart instance.
	 */
	public CartHelper() {
		this.latestItemId = 1;
		this.clearCart();
	}

	/**
	 * Clear all items from this cart instance.
	 */
	public void clearCart() {
		this.cartItems = new ArrayList<CartItem>();
	}

	/**
	 * Add a new item to this cart instance. Each item is added with a
	 * ProductRatePlanId, a Quantity and a unique Cart Item identification
	 * number.
	 * 
	 * @param ratePlanId
	 *            The ProductRatePlanId of the item being added.
	 * @param quantity
	 *            The number of UOM to be applied to this rateplan for all
	 *            charges with a Per Unit quantity.
	 */
	public void addCartItem(String ratePlanId, String quantity) {
		// Create the new item
		CartItem cartItem = new CartItem();
		cartItem.setItemId(latestItemId++);
		cartItem.setRatePlanId(ratePlanId);
		cartItem.setQuantity(quantity);

		// Retrieve the rate plan
		CatalogRatePlan ratePlan = null;
		try {
			ratePlan = new CatalogHelper().getRatePlan(ratePlanId);
		} catch (Exception e) {
			e.printStackTrace();
		}

		cartItem.setUom(ratePlan.getUom());
		cartItem.setRatePlanName(ratePlan.getName());
		cartItem.setProductName(ratePlan.getProductName());

		// Add this item to this cart instance list
		this.cartItems.add(cartItem);
	}

	/**
	 * Removes an item from the user's cart.
	 * 
	 * @param itemId
	 *            The unique cart item ID of the item being removed.
	 * @return True if the operation is a success.
	 */
	public boolean removeCartItem(int itemId) {
		for (CartItem cartItem : cartItems) {
			if (cartItem.getItemId() == itemId) {
				return cartItems.remove(cartItem);
			}
		}
		return false;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	public Integer getLatestItemId() {
		return latestItemId;
	}

	public void setLatestItemId(Integer latestItemId) {
		this.latestItemId = latestItemId;
	}

}
