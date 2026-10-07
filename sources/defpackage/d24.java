package defpackage;

import android.util.Log;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.common.clientid.ClientId;
import com.vk.push.core.base.exception.HostIsNotMasterException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class d24 extends mdh implements cf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d24(Object obj, Object obj2, Object obj3, lq4 lq4Var, int i) {
        super(1, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        int i = this.e;
        Object obj = this.i;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                return new d24((g24) this.g, (q24) obj2, (uy3) obj, lq4Var, 0);
            case 1:
                return new d24((zt6) this.g, (fd4) obj2, (b41) obj, lq4Var, 1);
            case 2:
                return new d24((wd8) this.g, (ArrayList) obj2, (List) obj, lq4Var, 2);
            case 3:
                return new d24((pnb) this.g, (List) obj2, (List) obj, lq4Var, 3);
            case 4:
                return new d24((qwg) this.g, (swg) obj2, (ptf) obj, lq4Var, 4);
            case 5:
                return new d24((uli) this.g, (Map) obj2, (s94) obj, lq4Var, 5);
            case 6:
                return new d24((uli) this.g, (jc2) obj2, (Map) obj, lq4Var, 6);
            case 7:
                return new d24((xde) this.g, (String) obj2, (ClientId) obj, lq4Var, 7);
            case 8:
                return new d24((AppInfo) obj2, (efk) obj, lq4Var, 8);
            default:
                return new d24((xde) obj2, (String) obj, lq4Var, 9);
        }
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.e;
        Object obj2 = this.i;
        Object obj3 = this.h;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj;
        switch (i) {
            case 0:
                return ((d24) create(lq4Var)).invokeSuspend(sbiVar);
            case 1:
                return ((d24) create(lq4Var)).invokeSuspend(sbiVar);
            case 2:
                return ((d24) create(lq4Var)).invokeSuspend(sbiVar);
            case 3:
                return ((d24) create(lq4Var)).invokeSuspend(sbiVar);
            case 4:
                return ((d24) create(lq4Var)).invokeSuspend(sbiVar);
            case 5:
                return ((d24) create(lq4Var)).invokeSuspend(sbiVar);
            case 6:
                return ((d24) create(lq4Var)).invokeSuspend(sbiVar);
            case 7:
                return ((d24) create(lq4Var)).invokeSuspend(sbiVar);
            case 8:
                return new d24((AppInfo) obj3, (efk) obj2, lq4Var, 8).invokeSuspend(sbiVar);
            default:
                return new d24((xde) obj3, (String) obj2, lq4Var, 9).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objQ;
        AppInfo appInfo;
        Object objA;
        Object obj2;
        int i = this.e;
        Object obj3 = sbi.a;
        Object obj4 = this.i;
        hu4 hu4Var = hu4.a;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    Object objC = g24.c((g24) this.g, (q24) obj5, (uy3) obj4, this);
                    return objC == hu4Var ? hu4Var : objC;
                }
                if (i2 == 1) {
                    ch3.d0(obj);
                    return obj;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    if (zt6.b((zt6) this.g).c((fd4) obj5, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                ((b41) obj4).close();
                return obj3;
            case 2:
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return wd8.a((wd8) this.g, (ArrayList) obj5, (List) obj4, this) == hu4Var ? hu4Var : obj3;
                }
                if (i4 == 1) {
                    ch3.d0(obj);
                    return obj3;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                int i5 = this.f;
                if (i5 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return pnb.a((pnb) this.g, (List) obj5, (List) obj4, this) == hu4Var ? hu4Var : obj3;
                }
                if (i5 == 1) {
                    ch3.d0(obj);
                    return obj3;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                int i6 = this.f;
                if (i6 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    Object objG = qwg.g((qwg) this.g, (swg) obj5, (ptf) obj4, this);
                    return objG == hu4Var ? hu4Var : objG;
                }
                if (i6 == 1) {
                    ch3.d0(obj);
                    return obj;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                int i7 = this.f;
                if (i7 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    Object objM = uli.m((uli) this.g, jli.b, (Map) obj5, (s94) obj4, this);
                    return objM == hu4Var ? hu4Var : objM;
                }
                if (i7 == 1) {
                    ch3.d0(obj);
                    return obj;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                uli uliVar = (uli) this.g;
                int i8 = this.f;
                if (i8 != 0) {
                    if (i8 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#updateCamera2ConfigAsync");
                }
                LinkedHashMap linkedHashMap = uliVar.k;
                i64 i64Var = uli.l;
                ft0 ft0Var = new ft0();
                ft0Var.u((jc2) obj5);
                linkedHashMap.put(jli.c, new mli(ft0Var, new LinkedHashMap((Map) obj4), (pme) null, 12));
                mli mliVarO = uli.o(uliVar.k);
                this.f = 1;
                Object objQ2 = uliVar.q(mliVarO, null, this);
                return objQ2 == hu4Var ? hu4Var : objQ2;
            case 7:
                int i9 = this.f;
                if (i9 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    objQ = ((r6a) ((xde) this.g).b).q((String) obj5, (ClientId) obj4, this);
                    if (objQ == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i9 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                    objQ = ((roe) obj).a;
                }
                return new roe(objQ);
            case 8:
                efk efkVar = (efk) obj4;
                int i10 = this.f;
                if (i10 == 0) {
                    ch3.d0(obj);
                    appInfo = (AppInfo) obj5;
                    n7k n7kVar = (n7k) efkVar.g.getValue();
                    this.g = appInfo;
                    this.f = 1;
                    obj = n7kVar.e(this);
                    if (obj != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        ch3.d0(obj);
                        return obj3;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                appInfo = (AppInfo) this.g;
                ch3.d0(obj);
                if (cqk.d(appInfo, obj)) {
                    return obj3;
                }
                y3k y3kVar = (y3k) efkVar.m.getValue();
                this.g = null;
                this.f = 2;
                if (y3kVar.f(this) != hu4Var) {
                    return obj3;
                }
                return hu4Var;
            default:
                xde xdeVar = (xde) obj5;
                int i11 = this.f;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ch3.d0(obj);
                        objA = ((roe) obj).a;
                    } else {
                        if (i11 != 2) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = this.g;
                        ch3.d0(obj);
                    }
                    return new roe(obj2);
                }
                ch3.d0(obj);
                this.f = 1;
                objA = ((eth) xdeVar.b).a((String) obj4, this);
                if (objA == hu4Var) {
                    return hu4Var;
                }
                Throwable thA = roe.a(objA);
                if (thA != null && (thA instanceof HostIsNotMasterException)) {
                    Logger.DefaultImpls.warn$default((Logger) xdeVar.e, "Register for pushes has failed, received HostIsNotMasterException", null, 2, null);
                    pfk pfkVar = (pfk) xdeVar.d;
                    this.g = objA;
                    this.f = 2;
                    Object objA2 = pfkVar.a.a(this);
                    if (objA2 == hu4Var) {
                        obj3 = objA2;
                    }
                    if (obj3 == hu4Var) {
                        return hu4Var;
                    }
                }
                obj2 = objA;
                return new roe(obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d24(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(1, lq4Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
    }
}
