<template>
    <div class="part">
        <h1>{{title}}</h1>
    </div>
</template>

<script>
export default {
    name:"part",
    props: ['title']
}
</script>

<style scoped>
    .part{
        border: solid .2em rgba(51, 51, 51,.7);
        border-radius: .3em;
        box-shadow: .2em .2em .01em 0 rgb(0 0 0 / 21%);
        cursor: pointer;
        transition: all 0.1s;
    }
    .part:hover{
        font-size: 1.55rem;
    }
    h1,h2{
        margin: 0px;
        font-size: 1.5rem;
    }
</style>