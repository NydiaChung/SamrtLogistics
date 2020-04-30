/*
 Navicat Premium Data Transfer

 Source Server         : MongoDB
 Source Server Type    : MongoDB
 Source Server Version : 40019
 Source Host           : localhost:27017
 Source Schema         : smart_logistics

 Target Server Type    : MongoDB
 Target Server Version : 40019
 File Encoding         : 65001

 Date: 27/04/2020 23:04:27
*/


// ----------------------------
// Collection structure for bank
// ----------------------------
db.getCollection("bank").drop();
db.createCollection("bank");

// ----------------------------
// Documents of bank
// ----------------------------
db.getCollection("bank").insert([ {
    _id: ObjectId("5e9fa5dad936000037007854"),
    id: 1,
    qualification: "",
    payInfo: "",
    sevice: ""
} ]);

// ----------------------------
// Collection structure for goods_agent
// ----------------------------
db.getCollection("goods_agent").drop();
db.createCollection("goods_agent");

// ----------------------------
// Documents of goods_agent
// ----------------------------
db.getCollection("goods_agent").insert([ {
    _id: ObjectId("5e9fa666d936000037007856"),
    id: 1,
    goodsInfo: "",
    carGoodsTrace: "",
    policy: "",
    need: "",
    pay: ""
} ]);

// ----------------------------
// Collection structure for person
// ----------------------------
db.getCollection("person").drop();
db.createCollection("person");

// ----------------------------
// Documents of person
// ----------------------------
db.getCollection("person").insert([ {
    _id: ObjectId("5e9fa6cfd936000037007857"),
    id: 1,
    payOnline: "",
    payQuerry: ""
} ]);

// ----------------------------
// Collection structure for product_company
// ----------------------------
db.getCollection("product_company").drop();
db.createCollection("product_company");

// ----------------------------
// Documents of product_company
// ----------------------------
db.getCollection("product_company").insert([ {
    _id: ObjectId("5e9fa752d936000037007858"),
    id: 1,
    storageStatus: "true",
    carGoodsTrace: "",
    market: ""
} ]);

// ----------------------------
// Collection structure for store_company
// ----------------------------
db.getCollection("store_company").drop();
db.createCollection("store_company");

// ----------------------------
// Documents of store_company
// ----------------------------
db.getCollection("store_company").insert([ {
    _id: ObjectId("5e9fa440d936000037007853"),
    id: 1,
    storeInfo: "",
    orderInfo: "",
    traceInfo: "",
    feedBack: ""
} ]);

// ----------------------------
// Collection structure for tax_department
// ----------------------------
db.getCollection("tax_department").drop();
db.createCollection("tax_department");

// ----------------------------
// Documents of tax_department
// ----------------------------
db.getCollection("tax_department").insert([ {
    _id: ObjectId("5e9fa7ccd936000037007859"),
    id: 1,
    companyInfo: "",
    taxSubmit: "true",
    taxOnline: "true"
} ]);

// ----------------------------
// Collection structure for trade_company
// ----------------------------
db.getCollection("trade_company").drop();
db.createCollection("trade_company");

// ----------------------------
// Documents of trade_company
// ----------------------------
db.getCollection("trade_company").insert([ {
    _id: ObjectId("5e9fa81dd93600003700785a"),
    id: 1,
    carGoodsTrace: "aaaaaa",
    orderOnline: "aaaaaaa"
} ]);
db.getCollection("trade_company").insert([ {
    _id: ObjectId("5ea62a8acc2a0000c0002022"),
    id: 2,
    carGoodsTrace: "bbbaaaaaa",
    orderOnline: "bbbaaaaaaa"
} ]);
db.getCollection("trade_company").insert([ {
    _id: ObjectId("5ea62a9acc2a0000c0002023"),
    id: 3,
    carGoodsTrace: "aaaabbbaa",
    orderOnline: "aaaaaabbba"
} ]);

// ----------------------------
// Collection structure for trade_department
// ----------------------------
db.getCollection("trade_department").drop();
db.createCollection("trade_department");

// ----------------------------
// Documents of trade_department
// ----------------------------
db.getCollection("trade_department").insert([ {
    _id: ObjectId("5ea6319ccc2a0000c0002025"),
    id: 2,
    development: "aaaqqqq",
    currency: "aaqqq",
    total: "aaaqqq"
} ]);
db.getCollection("trade_department").insert([ {
    _id: ObjectId("5ea63273b2b4dae906ffcd84"),
    id: 3,
    development: "222",
    currency: "222",
    total: "222"
} ]);
db.getCollection("trade_department").insert([ {
    _id: ObjectId("5ea634b8b2b4812b999fa954"),
    id: 4,
    development: "qqqq",
    currency: "qqq",
    total: "qqq"
} ]);
db.getCollection("trade_department").insert([ {
    _id: ObjectId("5ea63652b2b4f7f5e3d6fdc1"),
    id: NumberInt("5"),
    development: "123",
    currency: "123",
    total: "123"
} ]);
db.getCollection("trade_department").insert([ {
    _id: ObjectId("5ea6366fb2b4f7f5e3d6fdc2"),
    id: 1,
    development: "123",
    currency: "123",
    total: "123"
} ]);
db.getCollection("trade_department").insert([ {
    _id: ObjectId("5ea6375cb2b4f7f5e3d6fdc4"),
    development: "123",
    currency: "123",
    total: "123"
} ]);

// ----------------------------
// Collection structure for transport_company
// ----------------------------
db.getCollection("transport_company").drop();
db.createCollection("transport_company");

// ----------------------------
// Documents of transport_company
// ----------------------------
db.getCollection("transport_company").insert([ {
    _id: ObjectId("5ea4a9174b2b0000000001f2"),
    id: 1,
    goodsInfo: "20000",
    carGoodsMatch: "true",
    carGoodsTrace: "",
    deviceInfo: "123",
    transit: ""
} ]);
db.getCollection("transport_company").insert([ {
    _id: ObjectId("5ea4a9514b2b0000000001f4"),
    goodsInfo: "40000",
    carGoodsMatch: "true",
    carGoodsTrace: "",
    deviceInfo: "222",
    transit: ""
} ]);
db.getCollection("transport_company").insert([ {
    _id: ObjectId("5ea4a9604b2b0000000001f5"),
    id: 5,
    goodsInfo: "50000",
    carGoodsMatch: "true",
    carGoodsTrace: "",
    deviceInfo: "333",
    transit: ""
} ]);
db.getCollection("transport_company").insert([ {
    _id: ObjectId("5ea4a96b4b2b0000000001f6"),
    id: 6,
    goodsInfo: "60000",
    carGoodsMatch: "true",
    carGoodsTrace: "",
    deviceInfo: "444",
    transit: ""
} ]);
db.getCollection("transport_company").insert([ {
    _id: ObjectId("5ea4a9774b2b0000000001f7"),
    id: 7,
    goodsInfo: "70000",
    carGoodsMatch: "true",
    carGoodsTrace: "",
    deviceInfo: "555",
    transit: ""
} ]);
db.getCollection("transport_company").insert([ {
    _id: ObjectId("5ea4a9854b2b0000000001f8"),
    id: 8,
    goodsInfo: "70000",
    carGoodsMatch: "true",
    carGoodsTrace: "",
    deviceInfo: "666",
    transit: ""
} ]);
db.getCollection("transport_company").insert([ {
    _id: ObjectId("5ea52a14b2b46e74df05f683"),
    id: NumberInt("11"),
    goodsInfo: "123",
    carGoodsMatch: "true",
    carGoodsTrace: "213",
    deviceInfo: "213",
    transit: "213"
} ]);

// ----------------------------
// Collection structure for transport_department
// ----------------------------
db.getCollection("transport_department").drop();
db.createCollection("transport_department");

// ----------------------------
// Documents of transport_department
// ----------------------------
db.getCollection("transport_department").insert([ {
    _id: ObjectId("5e9fa8add93600003700785c"),
    id: 1,
    needInfo: "",
    carStatistics: "",
    border: ""
} ]);
