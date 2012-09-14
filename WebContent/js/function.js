function f(){
	alert('f');
}




//Takes in a Zuora data format, and returns a readable date string
function formatZDate(dateStr){
	//2012-06-01T00:00:00.000-08:00
	return dateStr.substr(5,2) + ' / ' + dateStr.substr(8,2) + ' / ' + dateStr.substr(0,4);
}

function formatUDate(dateStr){
	  if(typeof dateStr === 'number') dateStr = new Date(dateStr);
	  if(!(dateStr instanceof Date)) return dateStr;
	  function pad(n){return n<10 ? '0'+n : n}
	  return pad(dateStr.getMonth()+1)+'/'
	        + pad(dateStr.getDate())+'/'
	        + dateStr.getFullYear()+" "
	        + pad(dateStr.getHours()) + ":"
	        + pad(dateStr.getMinutes()) + ":"
	        + pad(dateStr.getSeconds());

}

//Logs an error to the console
function addError(emsg){
	console.log(emsg);
}