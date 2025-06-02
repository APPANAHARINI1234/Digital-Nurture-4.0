function getLocation(){
    if(navigator.geolocation){
        navigator.geolocation.getCurrentPosition(showPosition,showErr,{
            enableHighAccuracy : true,
            timeout:1000,
            maximumAge : 0
        })
    }
    else{
        document.getElementById("output").textContent = "not supported";
    }
}
function showPosition(pos){
    let latitute = pos.coords.latitude;
    let longitude = pos.coords.longitude;
    document.getElementById("output").textContent=`latitute is ${latitute}, longitute is ${longitude}`;
}

function showErr(err){
    document.getElementById("output").textContent="problem";
}