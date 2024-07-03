import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import qicheruku from '@/views/modules/qicheruku/list'
    import qicheguihai from '@/views/modules/qicheguihai/list'
    import toufangdiqu from '@/views/modules/toufangdiqu/list'
    import shiyongdingdan from '@/views/modules/shiyongdingdan/list'
    import yonghu from '@/views/modules/yonghu/list'
    import qichexinxi from '@/views/modules/qichexinxi/list'
    import qichetoufang from '@/views/modules/qichetoufang/list'
    import users from '@/views/modules/users/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/qicheruku',
        name: '汽车入库',
        component: qicheruku
      }
      ,{
	path: '/qicheguihai',
        name: '汽车归还',
        component: qicheguihai
      }
      ,{
	path: '/toufangdiqu',
        name: '投放地区',
        component: toufangdiqu
      }
      ,{
	path: '/shiyongdingdan',
        name: '使用订单',
        component: shiyongdingdan
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/qichexinxi',
        name: '汽车信息',
        component: qichexinxi
      }
      ,{
	path: '/qichetoufang',
        name: '汽车投放',
        component: qichetoufang
      }
      ,{
	path: '/users',
        name: '管理员',
        component: users
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
