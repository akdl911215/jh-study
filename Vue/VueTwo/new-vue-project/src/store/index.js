import Vue from 'vue';
import Vuex from 'vuex';

import state from './states';
import actions from './actions';
import mutations from './mutations';
import getters from './getters';

Vue.us(Vuex);

export default new Vuex.Store({
    state,
    actions,
    mutations,
    getters,
});
