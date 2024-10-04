
const times = ["Fluminense", "Vasco", "Botafogo"];
document.getElementById("principal").innerHTML = times;
function myFunction() {
    times.push("Flamengo");
    document.getElementById("principal").innerHTML = times;
}
function myFunction2() {
    times.pop();
    document.getElementById("principal").innerHTML = times;
}
