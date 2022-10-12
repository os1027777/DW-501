window.onload = function () {
    document.getElementById("bt").addEventListener("click", input);
}
function input() {

    // list_push(week.value);
    // week.value=""
    // week.focus()
    var week = document.getElementById("week")

    var year = document.getElementById("year");
    var month = document.getElementById("month");
    var ad = document.getElementById("ad");
    var age = document.getElementById("age");

    getYear(week.value);

    if (week.value == "") {
        alert("생년월일을 입력해주세요");
        year.innerHTML = ""
        month.innerHTML = ""
        ad.innerHTML = ""
        age.innerHTML = ""
        week.focus();
        return;
    }
    else{
    year.innerHTML = getYear(week.value) + "년";
    month.innerHTML = getMonth(week.value) + "월";
    ad.innerHTML = getad(week.value) + "일";
    age.innerHTML = getAge(week.value) + "세";
    week.value = "";
    week.focus();

}
}
function getYear(week) {
    var weeks = week.split(".");
    return weeks[0];

}
function getMonth(week) {
    var months = week.split(".");
    return months[1]
}
function getad(week) {
    var ads = week.split(".");
    return ads[2]
}

function getAge(week) {
    var ages = week.split(".");
    return 2022 - ages[0] + 1
}
