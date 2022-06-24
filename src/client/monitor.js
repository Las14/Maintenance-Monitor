setInterval(function (){
    $.ajax({
        url: "http://localhost:8080/upTimePercentage"
    }).then(function(data) {
        let uptime = parseFloat(data["uptime"].replace(/,/g, '.'));
        if(uptime >= 99.95) {
            $('body').css("background-color", "lightgreen")
        } else {
            $('body').css("background-color", "#ff4d4d")
        }

        $('.status').empty();
        $('.status').append("<h2>" + data["message"] + "</h2>");
        $('.status').append("Current Uptime: " + uptime + "% <br> <br>");
        $('.status').append("Last updated: ", new Date().toLocaleString())
    });
}, 5000)
