
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import EventStormingEventStormingManager from "./components/listers/EventStormingEventStormingCards"
import EventStormingEventStormingDetail from "./components/listers/EventStormingEventStormingDetail"

import BpmnBpmnManager from "./components/listers/BpmnBpmnCards"
import BpmnBpmnDetail from "./components/listers/BpmnBpmnDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/eventStormings/eventStormings',
                name: 'EventStormingEventStormingManager',
                component: EventStormingEventStormingManager
            },
            {
                path: '/eventStormings/eventStormings/:id',
                name: 'EventStormingEventStormingDetail',
                component: EventStormingEventStormingDetail
            },

            {
                path: '/bpmns/bpmns',
                name: 'BpmnBpmnManager',
                component: BpmnBpmnManager
            },
            {
                path: '/bpmns/bpmns/:id',
                name: 'BpmnBpmnDetail',
                component: BpmnBpmnDetail
            },



    ]
})
