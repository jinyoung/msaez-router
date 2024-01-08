<script setup>
import {
  VerticalNavLink,
  VerticalNavSectionTitle,
} from '@layouts'
</script>

<template>
    <ul>
        <VerticalNavSectionTitle :item="{ heading: 'EventStorming' }" />
        <VerticalNavLink
            :item="{
                title: 'EventStorming',
                to: '/eventStormings',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'Bpmn' }" />
        <VerticalNavLink
            :item="{
                title: 'Bpmn',
                to: '/bpmns',
            }"
        />
    </ul>
</template>
