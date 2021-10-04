<template>
<div class="pageWraper">
       <div class="title"><h2>Ch43 單層迴圈  </h2> &nbsp;<i class="bi bi-arrow-left-circle" @click="back"></i></div>
       <h3> 1. 末端脫離 </h3>
     <p>語法 do { ...  } while(...);  
        <a href="Ch22_structure5_doWh.GIF">do-while圖解(大一Ch22) </a></p>
     <p><a href="Flow1.java">Flow1.java</a>, 
        <a href="Flow1.cpp">Flow1.cpp</a>, 
        <a href="Ch05_Flow1.GIF">Ch05_Flow1.GIF</a> </p> 
     <p><a href="Flow2.java">Flow2.java</a>, <a href="Flow2.cpp">Flow2.cpp</a></p> 
     <p><a href="Flow3.java">Flow3.java</a>, <a href="Flow3.cpp">Flow3.cpp</a> </p> 
     <p>練習: 自行改寫成java: <a href="Flow4.cpp">Flow4.cpp</a> </p> 

<h3> 2. 前端脫離 </h3>
     <p> 語法 for(initExp; contExp; upExp) { ... }  
         <a href="Ch21_structure1_for.GIF">for圖解(大一Ch21)</a></p>
     <p> 語法 while(conExp) { ... } 
         <a href="Ch21_structure2_while.GIF">while圖解(Ch21)</a></p>
     <p><a href="Flow5.java">Flow5.java 
          <a href="Flow5.cpp">Flow5.cpp</a>, 
        <a href="Ch05_Flow5.GIF">Ch05_Flow5.GIF</a>
        </a>
         </p> 
     <p> <a href="Flow6.java">Flow6.java</a>, <a href="Flow6.cpp">Flow6.cpp</a></p> 
     <p> 計算平方和 1*1+2*2+...+n*n 
         <a href="Flow7X.java">Flow7X.java</a>, <a href="Flow7X.cpp">Flow7X.cpp</a></p> 
     <p> 求最小的 k 使 power(2,k)>=bound 
         <a href="Flow8.java">Flow8.java</a></p> 
     
<h3> 3. 中間脫離 </h3>
     <p> 語法 while(true) { ....  if(...) break; ... } 
         <a href="midEscape.GIF">圖解</a></p>
     <p> 求最大公因數(Greatest Common Divisor) 
         <a href="gcd.GIF">圖例</a>,
         <a href="Gcd.java">Gcd.java</a>, <a href="gcdL.cpp">gcdL.cpp</a></p> 
<h3> 4. break 與 continue </h3>
     <p> break用來跳出迴圈(for, while, 或 do-while) </p> 
     <p> continue用來跳到迴圈末尾 </p> 
     <p> TODO </p> 
         
<h3> 習題 </h3>
     <p><a href="Ch43Ex_Loop.txt">Ch43Ex_Loop.txt</a></p>

</div>
</template>

<script>
import bus from '../components/bus.ts'
export default {
     name:"page43",
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