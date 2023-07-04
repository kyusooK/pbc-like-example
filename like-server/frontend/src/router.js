
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import LikeManager from "./components/listers/LikeCards"
import LikeDetail from "./components/listers/LikeDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/likes',
                name: 'LikeManager',
                component: LikeManager
            },
            {
                path: '/likes/:id',
                name: 'LikeDetail',
                component: LikeDetail
            },



    ]
})
