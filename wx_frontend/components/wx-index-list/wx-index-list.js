// component/wx-index-list/wx-index-list.js
Component({
  /**
   * 组件的属性列表
   */
  properties: {
    data: {
      type: Object,
      value: {},
    },
    myCity: {
      type: String,
      value: "",
    },
  },

  data: {
    list: [],
    rightArr: [],// 右侧字母展示
    jumpNum: '',//跳转到那个字母
    myCityName: '请选择' // 默认我的城市

  },
  ready() {
    let data = this.data.data;
    this.resetRight(data);
    if (this.data.myCity) {
      this.getCity()
    }
  },
  methods: {
    // 数据重新渲染
    resetRight(data) {
      let rightArr = []
      for (let i in data) {
        rightArr.push(data[i].title.substr(0, 1));
      }
      this.setData({
        list: data,
        rightArr
      })
    },
    getCity() {
      wx.getLocation({
        type: 'wgs84',
        success: function (res) {
          this.latitude = res.latitude;
          this.longitude = res.longitude;
          // console.log(res)
        }
      })
    },
    // 右侧字母点击事件
    jumpMt(e) {
      let jumpNum = e.currentTarget.dataset.id;
      console.log(123456)
      this.setData({ jumpNum });
      console.log(this.data.jumpNum)
    },
    // 列表点击事件
    detailMt(e) {
      let detail = e.currentTarget.dataset.detail;
      
      let myEventOption = {
        bubbles: false,//事件是否冒泡
        composed: false,//事件是否可以穿越组件边界
        capturePhase: false //事件是否拥有捕获阶段
      } // 触发事件的选项
      this.triggerEvent('detail', detail, myEventOption)

    },
    

  }
})
