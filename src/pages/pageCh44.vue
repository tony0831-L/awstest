<template>
<div class="pageWraper">
       <div class="title"><h2>Ch44 雙層迴圈  </h2> &nbsp;<i class="bi bi-arrow-left-circle" @click="back"></i></div>
<h3> 1. 由c++版的雙層迴圈改寫java版的雙層迴圈 </h3>
     <p>由 <a href="Flow10_gg.cpp">Flow10_gg.cpp</a>, <br/>
           <a href="Flow10_ff.cpp">Flow10_ff.cpp</a>, 
        改寫 <a href="Flow10_ff.java">Flow10_ff.java</a>, <br/>
        由 <a href="Flow10_wf.cpp">Flow10_wf.cpp</a> 自寫 Flow10_wf.java, <br/>
        由 <a href="Flow10_ww.cpp">Flow10_ww.cpp</a> 自寫 Flow10_ww.java</p> 
     <p>由 <a href="Flow11_gg.cpp">Flow11_gg.cpp</a>,
           <a href="Flow11_ff.cpp">Flow11_ff.cpp</a>, 
        改寫 <a href="Flow11_ff.java">Flow11_ff.java</a>   
        </p> 
<h3> 2. 雙層迴圈的各種變化 </h3>
     <p>由 <a href="Flow12_gg.cpp">Flow12_gg.cpp</a>
           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        改寫 <a href="Flow12_ff.java">Flow12_ff.java</a>, 
        </p> 
     <p>由 <a href="Flow13_gg.cpp">Flow13_gg.cpp</a>, 
           <a href="Flow13_ff.cpp">Flow13_ff.cpp</a>,
        自寫 Flow13_ff.java, </p> 
     <p>由 <a href="Flow14_gg.cpp">Flow14_gg.cpp</a> 
           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        自寫 Flow14_ff.java </p> 
     <p>由 <a href="Flow15_gg.cpp">Flow15_gg.cpp</a> 
           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        自寫 Flow15_ff.java </p> 
     <p>由 <a href="Flow16_gg.cpp">Flow16_gg.cpp</a>
           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        自寫 Flow16_ff.java </p> 
     <p>由 <a href="Flow16A_gg.cpp">Flow16A_gg.cpp</a>,
           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        自寫 Flow16A_ff.java </p> 
     <p>由 <a href="Flow17_gg.cpp">Flow17_gg.cpp</a>,
           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        自寫 Flow17_ff.java </p> 
     <p>由 <a href="Flow18_gg.cpp">Flow18_gg.cpp</a>, 
           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        自寫 Flow18_ff.java </p> 
<h3> 3. 應用: 印99乘法表 </h3>
     <p>由 <a href="M99_gg.cpp">M99_gg.cpp</a>
           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        自寫 M99_ff.java</p> 

<h3> 4. 跳出深層迴圈 </h3>
     <p>指定lable的break <!-- <a href="For_break.java"> For_break.java </a> -->
                         <a href="DemoBreak.java"> DemoBreak.java</a>  </p> 

<h3> 5. 使用continue </h3>
     <p> <a href="DemoContinue.java"> DemoContinue.java</a>  </p> 

<h3> 習題 </h3>
     <p><a href="Ch44Exr_DLoop.txt">Ch44Exr_DLoop.txt</a></p>

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