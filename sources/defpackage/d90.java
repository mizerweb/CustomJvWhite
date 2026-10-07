package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;
import com.vk.push.core.DeviceIdRepository;
import com.vk.push.core.data.repository.IssueKey;
import com.vk.push.core.deviceid.CollectDeviceIdErrorsUseCase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import one.me.devmenu.DevMenuFeatureTogglesPageScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class d90 implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d90(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object b(lq4 lq4Var) {
        uof uofVar;
        bpf bpfVar = (bpf) this.b;
        if (lq4Var instanceof uof) {
            uofVar = (uof) lq4Var;
            int i = uofVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                uofVar.f = i - Integer.MIN_VALUE;
            } else {
                uofVar = new uof(this, lq4Var);
            }
        } else {
            uofVar = new uof(this, lq4Var);
        }
        Object objD = uofVar.d;
        int i2 = uofVar.f;
        if (i2 == 0) {
            ch3.d0(objD);
            xk7 xk7Var = bpfVar.d;
            uofVar.f = 1;
            objD = xk7Var.d(uofVar);
            hu4 hu4Var = hu4.a;
            if (objD == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objD);
        }
        bpfVar.B.setValue((ivf) objD);
        return sbi.a;
    }

    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        Object value;
        Float f;
        boolean z;
        Object objEmit;
        Object obj2;
        switch (this.a) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                mjg mjgVar = ((g90) this.b).g;
                do {
                    value = mjgVar.getValue();
                    c89 c89Var = (c89) value;
                    f = new Float(fFloatValue);
                    z = c89Var.b;
                    c89Var.getClass();
                } while (!mjgVar.h(value, new c89(f, z)));
                return sbi.a;
            case 1:
                zh2 zh2Var = (zh2) obj;
                hu4 hu4Var = hu4.a;
                sb2 sb2Var = (sb2) this.b;
                mjg mjgVar2 = sb2Var.f;
                sbi sbiVar = sbi.a;
                if (zh2Var instanceof vh2) {
                    mjgVar2.getClass();
                    mjgVar2.j(null, zh2Var);
                    return sbiVar;
                }
                if (!(zh2Var instanceof xh2)) {
                    return ((zh2Var instanceof wh2) && (objEmit = sb2Var.h.emit(sbiVar, lq4Var)) == hu4Var) ? objEmit : sbiVar;
                }
                mjgVar2.getClass();
                mjgVar2.j(null, zh2Var);
                return sbiVar;
            case 2:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c0a.t(((h9h) it.next()).a, arrayList);
                }
                rl3 rl3Var = (rl3) this.b;
                zv8[] zv8VarArr = rl3.Z1;
                ae9 ae9Var = (ae9) ((ss2) rl3Var.X.getValue()).a.getValue();
                ul9 ul9Var = new ul9();
                ul9Var.put("channels_shown", arrayList);
                ae9.k(ae9Var, "CHANNEL_RECSYS_FOLDER", "channel_folder_open", ul9Var.b(), 8);
                return sbi.a;
            case 3:
                ((CollectDeviceIdErrorsUseCase) this.b).b.nonFatalReport(((DeviceIdRepository.DeviceIdError) obj).getException(), IssueKey.DEVICE_ID_ERROR);
                return sbi.a;
            case 4:
                ((y85) this.b).o(false);
                return sbi.a;
            case 5:
                List list2 = (List) obj;
                DevMenuFeatureTogglesPageScreen devMenuFeatureTogglesPageScreen = (DevMenuFeatureTogglesPageScreen) this.b;
                devMenuFeatureTogglesPageScreen.h.I(list2, new lj5(devMenuFeatureTogglesPageScreen, list2));
                return sbi.a;
            case 6:
                List list3 = (List) obj;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "DisplayLayoutListener", zo5.h(list3.size(), "updateDisplayLayout send size="), null);
                    }
                }
                ((unc) ((rnc) ((io5) this.b).b.getValue())).updateDisplayLayout(list3);
                return sbi.a;
            case 7:
                qgc qgcVar = (qgc) obj;
                hk6 hk6Var = (hk6) this.b;
                zv8[] zv8VarArr2 = hk6.k;
                ev1 ev1Var = hk6Var.b().c;
                if (ev1Var != null) {
                    ev1Var.d(qgcVar);
                }
                return sbi.a;
            case 8:
                ((Collection) this.b).add(obj);
                return sbi.a;
            case 9:
                wfe wfeVar = (wfe) this.b;
                if (wfeVar.a == vd7.e) {
                    wfeVar.a = obj;
                    return sbi.a;
                }
                ore.p("Flow has more than one element");
                return null;
            case 10:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                FirebaseMessaging firebaseMessagingD = FirebaseMessaging.d();
                firebaseMessagingD.getClass();
                ov6 ov6VarB = ov6.b();
                ov6VarB.a();
                ov6VarB.a.getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", zBooleanValue).apply();
                fml.c(firebaseMessagingD.b, firebaseMessagingD.c, firebaseMessagingD.j());
                String str = ((gp7) this.b).b;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.e;
                    if (a4cVar2.b(je9Var2)) {
                        FirebaseMessaging.d().getClass();
                        a4cVar2.c(je9Var2, str, zo5.s("deliveryMetricsExportToBigQueryEnabled=", ouk.b()), null);
                    }
                }
                return sbi.a;
            case 11:
                int iOrdinal = ((s50) obj).ordinal();
                if (iOrdinal == 0) {
                    obj2 = zq9.a;
                } else {
                    if (iOrdinal != 1) {
                        ore.o();
                        return null;
                    }
                    obj2 = xq9.a;
                }
                Object objA = ((as9) this.b).r.a(lq4Var, obj2);
                return objA == hu4.a ? objA : sbi.a;
            case 12:
                return b(lq4Var);
            case 13:
                eoh.a((eoh) this.b);
                return sbi.a;
            default:
                jh2 jh2Var = (jh2) obj;
                iaj iajVar = (iaj) this.b;
                synchronized (iajVar.e) {
                    try {
                        if (jh2Var instanceof oh2) {
                            daj dajVar = new daj((gg) ((oh2) jh2Var).a);
                            iajVar.g = dajVar;
                            iajVar.b(new oh2(dajVar));
                        } else {
                            iajVar.b(jh2Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return sbi.a;
        }
    }
}
