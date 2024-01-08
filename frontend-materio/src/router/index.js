import { createRouter, createWebHashHistory } from 'vue-router';

const router = createRouter({
  history: createWebHashHistory(),
  routes: [
    {
      path: '/',
      component: () => import('../components/pages/Index.vue'),
    },
    {
      path: '/eventStormings',
      component: () => import('../components/ui/EventStormingGrid.vue'),
    },
    {
      path: '/bpmns',
      component: () => import('../components/ui/BpmnGrid.vue'),
    },
  ],
})

export default router;
