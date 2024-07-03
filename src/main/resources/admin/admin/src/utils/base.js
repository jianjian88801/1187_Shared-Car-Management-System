const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot2eidg/",
            name: "springboot2eidg",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot2eidg/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "共享汽车管理系统"
        } 
    }
}
export default base
