var btn = document.getElementById("myBtn");
var modal = document.getElementById("myModal");
var clos = document.getElementById("myClose");
var content = document.getElementById("cont");

var all_fw = [];

all_fw[0] = ["Spring", "PrimeFaces", "Blade"];
all_fw[1] = ["STL", "SFML", "Poco"];
all_fw[2] = ["Django", "CherryPy", "Grok"];

all_ch=[0,1,2,3,4,5,6,7,8,9,10];


PL_id.onchange = function () {
    fr_id.disabled = false;
    fr_id.innerHTML = "<option value='0'>Добавить</option>";
    myfw = this.value - 1;
    if (myfw != -1) {
        for (var i = 0; i < all_fw[myfw].length; i++) {
            fr_id.innerHTML += '<option value="' + (i + 1) + '">' + all_fw[myfw][i] + '</option>';
        }
    } else {
        fw_id.disabled = true;
    }
}

fr_id.onchange = function () {
    ch_id.disabled = false;
    ch_id.innerHTML = "<option value='0'>Добавить</option>";
    mych = this.value - 1;
    if (mych != -1) {
        for (var i = 0; i < all_ch.length; i++) {
            ch_id.innerHTML += '<option value="' + (i + 1) + '">' + all_ch[i] + '</option>';
        }
    } else {
        ch_id.disabled = true;
    }
}

ch_id.onchange = function () {
    fr1_id.disabled = false;
    fr1_id.innerHTML = "<option value='0'>Добавить</option>";
    myfw1 = PL_id.value-1;
    if (myfw1 != -1) {
        for (var i = 0; i < all_fw[myfw1].length; i++) {
            fr1_id.innerHTML += '<option value="' + (i + 1) + '">' + all_fw[myfw1][i] + '</option>';
        }
    } else {
        fw1_id.disabled = true;
    }
}

fr1_id.onchange = function () {
    ch1_id.disabled = false;
    ch1_id.innerHTML = "<option value='0'>Добавить</option>";
    mych1 = this.value-1;
    if (mych1 != -1) {
        for (var i = 0; i < all_ch.length; i++) {
            ch1_id.innerHTML += '<option value="' + (i + 1) + '">' + all_ch[i] + '</option>';
        }
    } else {
        ch1_id.disabled = true;
    }
}

ch1_id.onchange = function () {
    fr2_id.disabled = false;
    fr2_id.innerHTML = "<option value='0'>Добавить</option>";
    myfw2 = PL_id.value-1;
    if (myfw2 != -1) {
        for (var i = 0; i < all_fw[myfw2].length; i++) {
            fr2_id.innerHTML += '<option value="' + (i + 1) + '">' + all_fw[myfw2][i] + '</option>';
        }
    } else {
        fw2_id.disabled = true;
    }
}

fr2_id.onchange = function () {
    ch2_id.disabled = false;
    ch2_id.innerHTML = "<option value='0'>Добавить</option>";
    mych2 = this.value-1;
    if (mych2 != -1) {
        for (var i = 0; i < all_ch.length; i++) {
            ch2_id.innerHTML += '<option value="' + (i + 1) + '">' + all_ch[i] + '</option>';
        }
    } else {
        ch2_id.disabled = true;
    }
}

function opacity1() {
    content.style.opacity = 1;
}

function none() {
    modal.style.display = "none";
}

btn.onclick = function () {
    modal.style.display = "block";
    setTimeout(opacity1, 100);
}

clos.onclick = function () {
    content.style.opacity = "0";
    setTimeout(none, 1000);
}