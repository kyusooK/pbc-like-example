<template>
    <div style="margin: 0 -15px 0 -15px;">
        <v-card-title>
            {{label}}
        </v-card-title>
        <div v-if="!editMode" style="margin-top:-20px;">
            <v-btn v-if="!value.isliked" v-model="value.isliked" @click="toggleLike()" small icon>
                <v-icon style="color:black;" >mdi-heart-outline</v-icon>
            </v-btn>
            <v-btn v-else v-model="value.isliked" @click="toggleLike()" small icon>
                <v-icon style="color: red;" >mdi-heart</v-icon>
            </v-btn>
        </div>
    </div>
</template>

<script>
    const axios = require('axios').default;
    
    export default {
        name:"Likes",
        props: {
            editMode: Boolean,
            value : Object,
            label : String,
        },
        created(){
            if(!this.value) {
                this.value = {
                    'isliked': false,
                };
            }
        },
        watch: {
        },
        methods: {
            toggleLike(){
                this.value.isliked = !this.value.isliked;
                axios.put(axios.fixUrl('/likes'), this.value)
            }
        }
    }
</script>

<style>
</style>
