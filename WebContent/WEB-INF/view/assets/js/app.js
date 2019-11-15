function validate(){
	var name = document.form.name.value;
	var Point1 = document.form.Point1.value;
	var Point2 = document.form.Point2.value;
	var Point3 = document.form.Point3.value;
	//tên
	if(/[0-9]/.test(name)||name==""){
		document.getElementById("message1").innerHTML="*Invaliddd Name";
		return false;
	}else{
		 document.getElementById("message1").innerHTML="";
	}
	//diem toán
	if( Point1 < 0||Point1 > 10||Point1 ==""||/[A-z]/.test(Point1)){
		document.getElementById("message2").innerHTML = "*Invalid Point";
		return false;
	}else{
		document.getElementById("message2").innerHTML="";
	}
	//diem lý
	if( Point2 < 0||Point2 > 10||Point2 ==""||/[A-z]/.test(Point2)){
		document.getElementById("message3").innerHTML = "*Invalid Point";
		return false;
	}else{
		document.getElementById("message3").innerHTML="";
	}
	//diem hóa
	if( Point3 < 0||Point3 > 10||Point3 ==""||/[A-z]/.test(Point3)){
		document.getElementById("message4").innerHTML = "*Invalid Point";
		return false;
	}else{
		document.getElementById("message4").innerHTML="";
	}
	
}
