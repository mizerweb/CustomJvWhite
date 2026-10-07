package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class wj1 extends mdh implements cf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj1(uli uliVar, lq4 lq4Var) {
        super(1, lq4Var);
        this.e = 9;
        this.h = uliVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        int i = this.e;
        Object obj = this.h;
        switch (i) {
            case 0:
                return new wj1((xj1) this.g, (ArrayList) obj, lq4Var, 0);
            case 1:
                return new wj1((zt6) this.g, (fd4) obj, lq4Var, 1);
            case 2:
                return new wj1((ys9) this.g, (List) obj, lq4Var, 2);
            case 3:
                return new wj1((toa) this.g, (Map) obj, lq4Var, 3);
            case 4:
                return new wj1((tnb) this.g, (xmb) obj, lq4Var, 4);
            case 5:
                return new wj1((fpb) this.g, (List) obj, lq4Var, 5);
            case 6:
                return new wj1((aae) this.g, (ArrayList) obj, lq4Var, 6);
            case 7:
                return new wj1((bre) this.g, (List) obj, lq4Var, 7);
            case 8:
                return new wj1((xkh) this.g, (ArrayList) obj, lq4Var, 8);
            case 9:
                return new wj1((uli) obj, lq4Var);
            default:
                return new wj1((uli) this.g, (List) obj, lq4Var, 10);
        }
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
        return ((wj1) create(lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0157  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.AutoCloseable] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object objB;
        xf5 xf5Var;
        Object objG;
        AutoCloseable autoCloseable;
        Object objG2;
        Object objI;
        int i = this.e;
        sbi sbiVar = sbi.a;
        ?? r5 = "call to 'resume' before 'invoke' with coroutine";
        hu4 hu4Var = hu4.a;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return xj1.c((xj1) this.g, (ArrayList) obj2, 100, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i2 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return ((ppe) ((zt6) this.g).i.getValue()).c((fd4) obj2, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i3 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    Serializable serializableA = ys9.a((ys9) this.g, (List) obj2, this);
                    return serializableA == hu4Var ? hu4Var : serializableA;
                }
                if (i4 == 1) {
                    ch3.d0(obj);
                    return obj;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                int i5 = this.f;
                if (i5 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return wna.c((toa) this.g, (Map) obj2, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i5 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                int i6 = this.f;
                if (i6 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    Object objB2 = tnb.b((tnb) this.g, (xmb) obj2, this);
                    return objB2 == hu4Var ? hu4Var : objB2;
                }
                if (i6 == 1) {
                    ch3.d0(obj);
                    return obj;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                int i7 = this.f;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                fpb fpbVar = (fpb) this.g;
                this.f = 1;
                List<in6> list = (List) obj2;
                ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
                for (in6 in6Var : list) {
                    arrayList.add(in6Var.a + "_" + in6Var.c + "_" + in6Var.b);
                }
                StringBuilder sbC = nbh.C("DELETE FROM notifications_tracker_messages WHERE chat_id||'_'||post_id||'_'||message_id in (");
                vd7.b(sbC, arrayList.size());
                sbC.append(")");
                Object objI2 = ch3.I(this, fpbVar.a, false, true, new xs9(arrayList, 1, sbC.toString()));
                return objI2 == hu4Var ? hu4Var : objI2;
            case 6:
                int i8 = this.f;
                if (i8 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return aae.b((aae) this.g, (ArrayList) obj2, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i8 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                int i9 = this.f;
                if (i9 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return bre.d((bre) this.g, (List) obj2, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i9 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                int i10 = this.f;
                if (i10 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return xkh.d((xkh) this.g, (ArrayList) obj2, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i10 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                hmi hmiVar = ((uli) obj2).c;
                int i11 = this.f;
                try {
                    try {
                        try {
                            try {
                                if (i11 != 0) {
                                    if (i11 == 1) {
                                        ch3.d0(obj);
                                        objG2 = obj;
                                    } else if (i11 == 2) {
                                        AutoCloseable autoCloseable2 = (AutoCloseable) this.g;
                                        ch3.d0(obj);
                                        objI = obj;
                                        r5 = autoCloseable2;
                                        xf5Var = (xf5) objI;
                                        p90.f(r5, null);
                                        this.g = null;
                                        this.f = 3;
                                        if (xf5Var.z0(this) == hu4Var) {
                                            return hu4Var;
                                        }
                                        ze2 ze2VarA = hmiVar.a();
                                        this.f = 4;
                                        objG = ze2VarA.g(this);
                                        if (objG == hu4Var) {
                                            return hu4Var;
                                        }
                                    } else if (i11 == 3) {
                                        ch3.d0(obj);
                                        ze2 ze2VarA2 = hmiVar.a();
                                        this.f = 4;
                                        objG = ze2VarA2.g(this);
                                        if (objG == hu4Var) {
                                            return hu4Var;
                                        }
                                    } else {
                                        if (i11 != 4) {
                                            ore.k("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                        ch3.d0(obj);
                                        objG = obj;
                                    }
                                    autoCloseable = (AutoCloseable) objG;
                                    MeteringRectangle[] meteringRectangleArr = te2.a;
                                    objB = ie2.b((cf2) autoCloseable, null, null, null, Arrays.asList(meteringRectangleArr), Arrays.asList(meteringRectangleArr), Arrays.asList(meteringRectangleArr), 7);
                                    p90.f(autoCloseable, null);
                                    return objB;
                                }
                                ch3.d0(obj);
                                if (tvj.f(3, "CXCP")) {
                                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#cancelFocusAndMeteringAsync");
                                }
                                ze2 ze2VarA3 = hmiVar.a();
                                this.f = 1;
                                objG2 = ze2VarA3.g(this);
                                if (objG2 == hu4Var) {
                                    return hu4Var;
                                }
                                MeteringRectangle[] meteringRectangleArr2 = te2.a;
                                objB = ie2.b((cf2) autoCloseable, null, null, null, Arrays.asList(meteringRectangleArr2), Arrays.asList(meteringRectangleArr2), Arrays.asList(meteringRectangleArr2), 7);
                                p90.f(autoCloseable, null);
                                return objB;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    p90.f(autoCloseable, th);
                                    throw th2;
                                }
                            }
                            AutoCloseable autoCloseable3 = (AutoCloseable) objG2;
                            this.g = autoCloseable3;
                            this.f = 2;
                            objI = cf2.I((cf2) autoCloseable3, 0L, 56);
                            r5 = autoCloseable3;
                            if (objI == hu4Var) {
                                return hu4Var;
                            }
                            xf5Var = (xf5) objI;
                            p90.f(r5, null);
                        } catch (CancellationException e) {
                            if (tvj.f(3, "CXCP")) {
                                Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e);
                            }
                            xf5Var = uli.l;
                        }
                        this.g = null;
                        this.f = 3;
                        if (xf5Var.z0(this) == hu4Var) {
                            return hu4Var;
                        }
                        ze2 ze2VarA4 = hmiVar.a();
                        this.f = 4;
                        objG = ze2VarA4.g(this);
                        if (objG == hu4Var) {
                            return hu4Var;
                        }
                        autoCloseable = (AutoCloseable) objG;
                    } catch (CancellationException e2) {
                        if (tvj.f(3, "CXCP")) {
                            Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e2);
                        }
                        objB = uli.l;
                    }
                } catch (Throwable th3) {
                    ?? r8 = r5;
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        p90.f(r8, th3);
                        throw th4;
                    }
                }
                break;
            default:
                uli uliVar = (uli) this.g;
                LinkedHashMap linkedHashMap = uliVar.k;
                List list2 = (List) obj2;
                int i12 = this.f;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                boolean zF = tvj.f(3, "CXCP");
                jli jliVar = jli.b;
                if (zF) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#removeParametersAsync: [" + jliVar + "] keys = " + list2);
                }
                Object mliVar = linkedHashMap.get(jliVar);
                if (mliVar == null) {
                    mliVar = new mli((ft0) null, (LinkedHashMap) null, (pme) null, 15);
                    linkedHashMap.put(jliVar, mliVar);
                }
                mli mliVar2 = (mli) mliVar;
                ft0 ft0Var = new ft0();
                ft0Var.u((w8b) mliVar2.a.a);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((w8b) ft0Var.a).o(shl.a((CaptureRequest.Key) it.next()));
                }
                linkedHashMap.put(jliVar, new mli(ft0Var, new LinkedHashMap(mliVar2.b), ww3.W1(mliVar2.c), mliVar2.d));
                mli mliVarO = uli.o(uliVar.k);
                this.f = 1;
                Object objQ = uliVar.q(mliVarO, null, this);
                return objQ == hu4Var ? hu4Var : objQ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wj1(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(1, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
    }
}
