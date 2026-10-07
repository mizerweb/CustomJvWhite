package com.vk.push.core.network.data.source;

import com.vk.push.common.HostInfoProvider;
import com.vk.push.core.network.http.HttpClient;
import defpackage.ao5;
import defpackage.c37;
import defpackage.ch3;
import defpackage.hu4;
import defpackage.j95;
import defpackage.lb5;
import defpackage.lq4;
import defpackage.on9;
import defpackage.ore;
import defpackage.pn9;
import defpackage.qn9;
import defpackage.rn9;
import defpackage.roe;
import defpackage.xt4;
import defpackage.yab;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0010J(\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\rH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/vk/push/core/network/data/source/MasterHostApi;", "", "Lcom/vk/push/core/network/http/HttpClient;", "httpClient", "Lcom/vk/push/common/HostInfoProvider;", "hostInfoProvider", "Lxt4;", "dispatcher", "<init>", "(Lcom/vk/push/core/network/http/HttpClient;Lcom/vk/push/common/HostInfoProvider;Lxt4;)V", "", "", "hostAppInfoList", "Lroe;", "Lcom/vk/push/common/AppInfo;", "getMaster-gIAlu-s", "(Ljava/util/List;Llq4;)Ljava/lang/Object;", "getMaster", "installedHostList", "getHostList-gIAlu-s", "getHostList", "getAllExistingHostList-IoAF18A", "(Llq4;)Ljava/lang/Object;", "getAllExistingHostList", "core-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MasterHostApi {
    public final HttpClient a;
    public final HostInfoProvider b;
    public final xt4 c;

    /* JADX WARN: Illegal instructions before constructor call */
    public MasterHostApi(HttpClient httpClient, HostInfoProvider hostInfoProvider, xt4 xt4Var, int i, j95 j95Var) {
        if ((i & 4) != 0) {
            ao5 ao5Var = ao5.a;
            xt4Var = lb5.c;
        }
        this(httpClient, hostInfoProvider, xt4Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: getAllExistingHostList-IoAF18A */
    public final Object m23getAllExistingHostListIoAF18A(lq4 lq4Var) {
        on9 on9Var;
        if (lq4Var instanceof on9) {
            on9Var = (on9) lq4Var;
            int i = on9Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                on9Var.f = i - Integer.MIN_VALUE;
            } else {
                on9Var = new on9(this, lq4Var);
            }
        } else {
            on9Var = new on9(this, lq4Var);
        }
        Object objK0 = on9Var.d;
        int i2 = on9Var.f;
        if (i2 == 0) {
            ch3.d0(objK0);
            c37 c37Var = new c37(this, null, 6);
            on9Var.f = 1;
            objK0 = yab.K0(this.c, c37Var, on9Var);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK0);
        }
        return ((roe) objK0).a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: getHostList-gIAlu-s */
    public final Object m24getHostListgIAlus(List<String> list, lq4 lq4Var) {
        pn9 pn9Var;
        if (lq4Var instanceof pn9) {
            pn9Var = (pn9) lq4Var;
            int i = pn9Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                pn9Var.f = i - Integer.MIN_VALUE;
            } else {
                pn9Var = new pn9(this, lq4Var);
            }
        } else {
            pn9Var = new pn9(this, lq4Var);
        }
        Object objK0 = pn9Var.d;
        int i2 = pn9Var.f;
        if (i2 == 0) {
            ch3.d0(objK0);
            qn9 qn9Var = new qn9(list, this, null, 0);
            pn9Var.f = 1;
            objK0 = yab.K0(this.c, qn9Var, pn9Var);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK0);
        }
        return ((roe) objK0).a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: getMaster-gIAlu-s */
    public final Object m25getMastergIAlus(List<String> list, lq4 lq4Var) {
        rn9 rn9Var;
        if (lq4Var instanceof rn9) {
            rn9Var = (rn9) lq4Var;
            int i = rn9Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                rn9Var.f = i - Integer.MIN_VALUE;
            } else {
                rn9Var = new rn9(this, lq4Var);
            }
        } else {
            rn9Var = new rn9(this, lq4Var);
        }
        Object objK0 = rn9Var.d;
        int i2 = rn9Var.f;
        if (i2 == 0) {
            ch3.d0(objK0);
            qn9 qn9Var = new qn9(list, this, null, 1);
            rn9Var.f = 1;
            objK0 = yab.K0(this.c, qn9Var, rn9Var);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK0);
        }
        return ((roe) objK0).a;
    }

    public MasterHostApi(HttpClient httpClient, HostInfoProvider hostInfoProvider, xt4 xt4Var) {
        this.a = httpClient;
        this.b = hostInfoProvider;
        this.c = xt4Var;
    }
}
