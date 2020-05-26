<#include "/common/commoncss.ftl">
<#include "/common/modalTip.ftl"/>
<style type="text/css">
    a {
        color: black;
    }
    td {
        text-align: center;
    }
    th {
        text-align: center;
    }
    a:hover {
        text-decoration: none;
    }

    .bgc-w {
        background-color: #fff;
    }
</style>
<div class="row" style="padding-top: 10px;">
    <div class="col-md-2">
        <h1 style="font-size: 24px; margin: 0;" class="">单位管理</h1>
    </div>
    <div class="col-md-10 text-right">
        <a href="##"><span class="glyphicon glyphicon-home"></span> 首页</a> > <a
                disabled="disabled">单位管理</a>
    </div>
</div>
<div class="row" style="padding-top: 15px;">
    <div class="col-md-12">
        <!--id="container"-->
        <div class="bgc-w box box-primary">
            <!--盒子头-->
            <div class="box-header">
                <h3 class="box-title">
                    <a href="unitedit" class="label label-success" style="padding: 5px;">
                        <span class="glyphicon glyphicon-plus"></span> 新增
                    </a>
                </h3>
                <!-- <div class="box-tools">
                    <div class="input-group" style="width: 150px;">
                        <input type="text" class="form-control input-sm"
                            placeholder="查找..." />
                        <div class="input-group-btn">
                            <a class="btn btn-sm btn-default"><span
                                class="glyphicon glyphicon-search"></span></a>
                        </div>
                    </div>
                </div> -->
            </div>
            <!--盒子身体-->
            <div class="box-body no-padding">
                <div class="table-responsive">
                    <table class="table table-hover table-striped">
                        <tr>
                            <th scope="col">单位名称</th>
                            <th scope="col">电话</th>
                            <th scope="col">地址</th>
                            <th scope="col">邮编</th>
                            <th scope="col">网址</th>
                            <th scope="col">邮箱</th>
                            <th scope="col">银行卡号</th>
                            <th scope="col">开户行</th>
                            <th scope="col">操作</th>
                        </tr>
                        <#list units as unit>
                            <tr>
                                <td><span>${unit.name}</span></td>
                                <td><span>${unit.phone}</span></td>
                                <td><span>${unit.address}</span></td>
                                <td><span>${unit.postalcode}</span></td>
                                <td><span>${unit.website}</span></td>
                                <td><span>${unit.email}</span></td>
                                <td><span>${unit.banknuber}</span></td>
                                <td><span>${unit.openingbank}</span></td>
                                <td>
                                    <a href="unitedit?unit=${unit.id}" class="label xiugai">
                                        <span class="glyphicon glyphicon-edit"></span> 修改</a>
                                    <a href="deleteunit?unitid=${unit.id}" class="label shanchu"><span
                                                class="glyphicon glyphicon-remove"></span> 删除</a></td>
                            </tr>
                        </#list>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
