function setData() {
    let uptime = $('#uptime').val();
    let message = $('#message').val();


    $.ajax({
        url: "http://localhost:8092/updateStatus",
        type: "GET",
        data: { uptime: encodeURIComponent(uptime), message: message}
    }).then(function(data) {
        $('.status').empty();
        $('.status').append("Updated!");
    });
}

function resetData() {
    $.ajax({
        url: "http://localhost:8092/resetStatus",
        type: "GET",
    }).then(function(data) {
        $('.status').empty();
        $('.status').append("Reset!");
    });
}