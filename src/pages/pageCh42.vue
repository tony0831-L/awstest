<template>
<div class="pageWraper">
       <div class="title"><h2>Ch42 直線型的程式 </h2> &nbsp;<i class="bi bi-arrow-left-circle" @click="back"></i></div>
<h3> 1. 運算 </h3>
     <p>浮點數運算 <a href="Prog7.java">Prog7.java</a>, 
              參考 <a href="Prog7.cpp">Prog7.cpp</a></p> 
     <p>整數運算 <a href="Prog8.java">Prog8.java</a>, 
              參考 <a href="Prog8.cpp">Prog8.cpp</a></p> 

<h3> 2. 變數與設值 </h3>
     <p>整數通常是用 int 型態,  浮點數通常是用雙精度的 double 型態, 其它稍後說明. </p> 
     <p>設值 <a href="Prog10.java">Prog10.java</a>, 
         參考 <a href="Prog10.cpp">Prog10.cpp</a> </p> 
     
<h3> 3. 整數數值(literal)的各種進位(radix)  </h3>
     <p>10進位數值(literal)以1~9起首, <br/> 
        16進位數值(literal)以0x或0X起首, <br/>
        8進位數值(literal)以0起首, <br/>
        2進位數值(literal)以0b 或0B起首(較新版的java) </p>
     <p>2進位值通常很長, 所以傳統上是寫成16進位值. </p>   
     <p>數值中可以混用底線來隔開(較新版的java) </p>   
     <p>實例 <a href="Prog9m.java">Prog9m.java</a> </p>

<h3> 4. 用各種進位印出 </h3>
     <p>查閱 JavaSE API, class java.lang.Integer </p>
     <p>Integer.toHexString(int), Integer.toOctalString(int),
        Integer.toBinaryString(int), Integer.toString(int) 參數是整數值. </p>
     <p> <a href="Prog9.java"> Prog9.java </a>, 
        參考 <a href="Prog9.cpp">Prog9.cpp</a></p> 
     <p>Integer.toString(int value, int radix), 
        第一參數是整數值, 第二參數是進位. 請自行練習. </p>

<h3> 5. 各種型態 </h3>  <!-- 來自於 A51005-->
     <p> java 的 primitive types: <br/>
         byte, short, int, long, float, double, boolean, char. 
     <a href="T1_primitive.txt">說明(T1_primitive.txt)</a></p> 
     <p>整數類的實例 <a href="DemoIntTypes.java">DemoIntTypes.java</a></p> 
     <p>浮點數類的實例 <a href="DemoFloatTypes.java">DemoFloatTypes.java</a></p> 
     <p>其它原生類的實例 <a href="DemoElseTypes.java">DemoElseTypes.java</a></p> 
     
<h3> 6. 轉型 </h3> <!-- 來自於 A51005-->
     <p>原生型態使用靜態轉型 <a href="T1a_primitive.txt">說明(T1a_primitive.txt)</a></p> 
     <p>整數切短 <a href="T3_cast.GIF">說明(T3_cast.GIF)</a></p> 
     <p><a href="Cast.java">Cast.java</a></p> 
     
<h3> 7. 輸入 </h3> <!-- A701025 add -->
     <p>用來輸入資料的物件 java.util.Scanner </p> 
     <p>實例: 攝氏溫度轉華氏<a href="C2F.java">C2F.java</a></p> 
     <p>請自行參閱 java.util.Scanner 的 API. </p> 

<h3> 習題 </h3> <!-- A701025 add -->
     <p><a href="Ch42_Exr.txt">Ch42_Exr.txt</a></p> 


</div>
</template>

<script>
import bus from '../components/bus.ts'
export default {
     name:"page41",
     methods:{
          back(){
               bus.emit('status','back')
               bus.emit('page',0)
          }
     }
}
</script>

<style scoped>
     .pageWraper{
          margin-top: 20%;
          border: solid .2em #333;
          padding: 1% 2%;
          border-radius: .3em;
          box-shadow: .5em .5em .05em 0 rgb(0 0 0 / 21%);
     }
     *{
          font-family: 'Noto Sans TC', '微軟正黑體', sans-serif;
          margin-bottom: .15em;
     }
     h2{
          font-size: 1.5rem;
          margin-bottom: .2em;
          color: #333;
     }
     p{
          font-size: 1rem;
          color: #333;
     }
     .title{
          display: flex;
          font-size: 1.25rem;
          margin-bottom: .2em;
          color: #333;
          align-items: center;
     }
     .title i{
          cursor: pointer;
     }
</style>