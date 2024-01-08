<template>
    <div>
        <String label="Requirement" v-model="value.requirement" :editMode="editMode"/>
        <String label="Json" v-model="value.json" :editMode="editMode"/>

        <v-divider class="border-opacity-100 my-divider"></v-divider>
        <v-layout row justify-end>
            <v-btn
                width="64px"
                color="primary"
                @click="save"
            >
                저장
            </v-btn>
        </v-layout>
    </div>
</template>


<script>

import BaseEntity from './base-ui/BaseEntity.vue'
import String from './primitives/String.vue'

export default {
    name: 'Bpmn',
    mixins:[BaseEntity],
    components:{
        String,
    },
    
    data: () => ({
        path: "bpmns"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
