package defpackage;

import android.net.Uri;
import java.io.File;
import java.text.Collator;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.android.media.service.OneMeMediaSessionService;
import one.me.sdk.statistics.perf.utils.LazyModeEventLimitException;
import ru.ok.tamtam.workmanager.BacklogWorker;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class wyj extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wyj(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return new wyj((xyj) obj2, lq4Var, 0);
            case 1:
                return new wyj((n30) obj2, lq4Var, 1);
            case 2:
                return new wyj((u50) obj2, lq4Var, 2);
            case 3:
                return new wyj((BacklogWorker) obj2, lq4Var, 3);
            case 4:
                return new wyj((m31) obj2, lq4Var, 4);
            case 5:
                return new wyj((nl1) obj2, lq4Var, 5);
            case 6:
                return new wyj((yk4) obj2, lq4Var, 6);
            case 7:
                return new wyj((ny8) obj2, lq4Var, 7);
            case 8:
                return new wyj((dd6) obj2, lq4Var, 8);
            case 9:
                return new wyj((qu) obj2, lq4Var, 9);
            case 10:
                return new wyj((OneMeMediaSessionService) obj2, lq4Var, 10);
            case 11:
                return new wyj((qrc) obj2, lq4Var, 11);
            case 12:
                return new wyj((n3) obj2, lq4Var, 12);
            case 13:
                return new wyj((zne) obj2, lq4Var, 13);
            case 14:
                return new wyj((xte) obj2, lq4Var, 14);
            case 15:
                return new wyj((iug) obj2, lq4Var, 15);
            case 16:
                return new wyj((cnh) obj2, lq4Var, 16);
            default:
                return new wyj((lbj) obj2, lq4Var, 17);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((wyj) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                ((wyj) create((sbi) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                ((wyj) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                return ((wyj) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                ((wyj) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 5:
                ((wyj) create((bg9) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 6:
                ((wyj) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 7:
                return ((wyj) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((wyj) create(Integer.valueOf(((Number) obj).intValue()), (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                ((wyj) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 10:
                ((wyj) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 11:
                ((wyj) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 12:
                ((wyj) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 13:
                ((wyj) create(Integer.valueOf(((Number) obj).intValue()), (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 14:
                ((wyj) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 15:
                ((wyj) create((zi4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 16:
                ((wyj) create((kbc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                ((wyj) create((we4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x018e  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f7  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object poeVar;
        Object value;
        int iO;
        b0a b0aVarX;
        float f;
        z = false;
        boolean z = false;
        switch (this.e) {
            case 0:
                sbi sbiVar = sbi.a;
                ch3.d0(obj);
                String str = xyj.n;
                gm0.n(str, "enableWorkManager");
                xyj xyjVar = (xyj) this.f;
                AtomicBoolean atomicBoolean = xyjVar.i;
                if (atomicBoolean.getAndSet(true)) {
                    gm0.Y(str, "enableWorkManager: already initialized");
                } else {
                    try {
                        oyj oyjVarH = xyjVar.h();
                        gm0.x(str, "workmanager init success!", null);
                        xyjVar.h.B(xyjVar, xyj.m[0], yab.h0(xyjVar.b, ((n0c) xyjVar.c).b(), 2, new l83(xyjVar, oyjVarH, null, 16)));
                        int iIntValue = ((Number) xyjVar.d.j0.a(e5d.S6[59]).i()).intValue();
                        vd7.L(oyjVarH, new Integer(iIntValue >= 1 ? iIntValue : 1), xyjVar.e, null);
                    } catch (CancellationException e) {
                        atomicBoolean.set(false);
                        gm0.Y(xyj.n, "enableWorkManager: cancelled");
                        throw e;
                    } catch (Exception e2) {
                        atomicBoolean.set(false);
                        gm0.V(xyj.n, "fail to init workManager", new syj(e2));
                    }
                }
                return sbiVar;
            case 1:
                ch3.d0(obj);
                ((n30) this.f).c();
                return sbi.a;
            case 2:
                je9 je9Var = je9.f;
                ch3.d0(obj);
                u50 u50Var = (u50) this.f;
                try {
                    ju6 ju6Var = (ju6) ((rs6) ((ny8) u50Var.a).getValue());
                    ju6Var.getClass();
                    File fileJ = ju6.j(ju6Var.b(), "previewVideoCache");
                    try {
                        poeVar = Boolean.valueOf(fileJ.exists() && fileJ.canRead());
                    } catch (Throwable th) {
                        poeVar = new poe(th);
                    }
                    Boolean bool = Boolean.FALSE;
                    boolean z2 = poeVar instanceof poe;
                    Object obj2 = poeVar;
                    if (z2) {
                        obj2 = bool;
                    }
                    if (((Boolean) obj2).booleanValue()) {
                        File[] fileArrListFiles = fileJ.listFiles();
                        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                            String str2 = (String) u50Var.c;
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null && a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str2, "prefetchUriCache fail, files are empty", null);
                            }
                        } else {
                            if (fileArrListFiles.length > 1) {
                                lv5 lv5Var = new lv5(6);
                                if (fileArrListFiles.length > 1) {
                                    Arrays.sort(fileArrListFiles, lv5Var);
                                }
                            }
                            int iMin = Math.min(fileArrListFiles.length, 200);
                            for (int i = 0; i < iMin; i++) {
                                File file = fileArrListFiles[i];
                                String strA = svk.a(file.getName());
                                if (strA != null && strA.length() != 0) {
                                    ((mj9) u50Var.b).d(strA, Uri.fromFile(file));
                                }
                            }
                        }
                    } else {
                        String str3 = (String) u50Var.c;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                            a4cVar2.c(je9Var, str3, "prefetchUriCache fail, " + fileJ + " not exists or not readable", null);
                        }
                    }
                    break;
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Throwable th2) {
                    gm0.V((String) u50Var.c, "prefetchUriCache fail", th2);
                }
                return sbi.a;
            case 3:
                ch3.d0(obj);
                return new Integer(((BacklogWorker) this.f).n().g().count(0));
            case 4:
                ch3.d0(obj);
                ((m31) this.f).j.set(true);
                return sbi.a;
            case 5:
                ch3.d0(obj);
                ((nl1) this.f).b();
                return sbi.a;
            case 6:
                ch3.d0(obj);
                yk4 yk4Var = (yk4) this.f;
                int i2 = ((g5d) ((gjf) yk4Var.o.getValue())).p() ? R.string.contact_list_search_hint_with_nick : R.string.contact_list_search_hint;
                mjg mjgVar = yk4Var.C;
                do {
                    value = mjgVar.getValue();
                } while (!mjgVar.h(value, new tnh(i2)));
                return sbi.a;
            case 7:
                ch3.d0(obj);
                return Collator.getInstance(((zed) ((ny8) this.f).getValue()).a.v());
            case 8:
                ch3.d0(obj);
                return Boolean.valueOf(((dd6) this.f).a() != null);
            case 9:
                ch3.d0(obj);
                qid.i.f.a(new kee(3, (qu) this.f));
                return sbi.a;
            case 10:
                ch3.d0(obj);
                OneMeMediaSessionService oneMeMediaSessionService = (OneMeMediaSessionService) this.f;
                int i3 = OneMeMediaSessionService.k;
                return sbi.a;
            case 11:
                ch3.d0(obj);
                qrc qrcVar = (qrc) this.f;
                String str4 = qrcVar.b;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar3.b(je9Var2)) {
                        a4cVar3.c(je9Var2, str4, c0a.k(qrcVar.f.d().size(), "Started collecting, already have ", " events"), null);
                    }
                }
                if (((qrc) this.f).f.d().size() == 10) {
                    LazyModeEventLimitException lazyModeEventLimitException = new LazyModeEventLimitException(c0a.o("Limit 10 for ", ((qrc) this.f).r(), " was achieved"));
                    qrc qrcVar2 = (qrc) this.f;
                    String str5 = qrcVar2.b;
                    a4c a4cVar4 = gm0.f;
                    if (a4cVar4 != null) {
                        je9 je9Var3 = je9.f;
                        if (a4cVar4.b(je9Var3)) {
                            a4cVar4.c(je9Var3, str5, qrc.g(qrcVar2, null).concat(": Replay cache limit!"), lazyModeEventLimitException);
                        }
                    }
                }
                return sbi.a;
            case 12:
                ch3.d0(obj);
                n3 n3Var = (n3) this.f;
                za0 za0Var = (za0) n3Var.a;
                w7b w7bVar = za0Var.c;
                w7bVar.a(za0Var.l);
                float fFloatValue = ((Number) ((xb9) ((et3) za0Var.g.getValue())).Q().f()).floatValue();
                xte xteVar = w7bVar.a;
                yab.i0(xteVar.d, null, 0, new zzc(xteVar, fFloatValue, null), 3);
                vd7.B(za0Var.d.k()).Y(new g3(4, za0Var));
                za0Var.d();
                hbc hbcVar = (hbc) n3Var.b;
                d0j d0jVar = (d0j) hbcVar.b;
                float fFloatValue2 = ((Number) ((xb9) ((et3) ((ny8) hbcVar.f).getValue())).Q().f()).floatValue();
                e3j e3jVar = d0jVar.h;
                if (e3jVar != null) {
                    e3jVar.setPlaybackSpeed(fFloatValue2);
                }
                return sbi.a;
            case 13:
                ch3.d0(obj);
                zne zneVar = (zne) this.f;
                gm0.n(zneVar.e, "executeTasks");
                ((wzj) zneVar.a.getValue()).b();
                ((ika) zneVar.b.getValue()).b();
                return sbi.a;
            case 14:
                ch3.d0(obj);
                xte xteVar2 = (xte) this.f;
                mjg mjgVar2 = xteVar2.m;
                iu9 iu9Var = xteVar2.g;
                Long l = new Long(iu9Var != null ? iu9Var.e() : -1L);
                mjgVar2.getClass();
                mjgVar2.j(null, l);
                mjg mjgVar3 = xteVar2.o;
                iu9 iu9Var2 = xteVar2.g;
                Long l2 = new Long(iu9Var2 != null ? iu9Var2.L() : -1L);
                mjgVar3.getClass();
                mjgVar3.j(null, l2);
                iu9 iu9Var3 = xteVar2.g;
                int playbackState = iu9Var3 != null ? iu9Var3.getPlaybackState() : 1;
                xteVar2.p = playbackState;
                xteVar2.s = playbackState == 2;
                iu9 iu9Var4 = xteVar2.g;
                boolean z3 = iu9Var4 != null && iu9Var4.O();
                xteVar2.r = z3;
                if (!z3 && xteVar2.p == 3) {
                    z = true;
                }
                xteVar2.q = z;
                iu9 iu9Var5 = xteVar2.g;
                if (iu9Var5 != null) {
                    iu9Var5.f();
                }
                iu9 iu9Var6 = xteVar2.g;
                xteVar2.u = iu9Var6 != null ? iu9Var6.M() : null;
                iu9 iu9Var7 = xteVar2.g;
                int iM = -1;
                if (iu9Var7 != null) {
                    iu9Var7.U();
                    hu9 hu9Var = iu9Var7.d;
                    if (hu9Var.isConnected()) {
                        iO = hu9Var.O();
                    } else {
                        iO = -1;
                    }
                } else {
                    iO = -1;
                }
                xte.a(xteVar2, iO);
                iu9 iu9Var8 = xteVar2.g;
                if (iu9Var8 != null) {
                    iu9Var8.U();
                    hu9 hu9Var2 = iu9Var8.d;
                    if (hu9Var2.isConnected()) {
                        iM = hu9Var2.M();
                    }
                }
                xte.a(xteVar2, iM);
                iu9 iu9Var9 = xteVar2.g;
                if (iu9Var9 != null) {
                    iu9Var9.H();
                }
                iu9 iu9Var10 = xteVar2.g;
                if (iu9Var10 != null) {
                    iu9Var10.getRepeatMode();
                }
                iu9 iu9Var11 = xteVar2.g;
                if (iu9Var11 != null) {
                    iu9Var11.U();
                    hu9 hu9Var3 = iu9Var11.d;
                    b0aVarX = hu9Var3.isConnected() ? hu9Var3.X() : b0a.K;
                } else {
                    b0aVarX = null;
                }
                xteVar2.v = b0aVarX;
                iu9 iu9Var12 = xteVar2.g;
                xteVar2.w = iu9Var12 != null ? iu9Var12.getDuration() : -1L;
                iu9 iu9Var13 = xteVar2.g;
                if (iu9Var13 != null) {
                    iu9Var13.U();
                    hu9 hu9Var4 = iu9Var13.d;
                    s2d s2dVarC = hu9Var4.isConnected() ? hu9Var4.c() : s2d.d;
                    if (s2dVarC != null) {
                        f = s2dVarC.a;
                    } else {
                        f = 1.0f;
                    }
                } else {
                    f = 1.0f;
                }
                xteVar2.x = f;
                iu9 iu9Var14 = xteVar2.g;
                if (iu9Var14 != null) {
                    iu9Var14.N();
                }
                mjg mjgVar4 = xteVar2.z;
                Float f2 = new Float(oc9.u((float) (((Number) mjgVar2.getValue()).doubleValue() / xteVar2.w), 0.0f, 1.0f));
                mjgVar4.getClass();
                mjgVar4.j(null, f2);
                return sbi.a;
            case 15:
                ch3.d0(obj);
                a8j.x(((iug) this.f).p, new hrg(new tnh(R.string.common_error)));
                return sbi.a;
            case 16:
                ch3.d0(obj);
                String str6 = ((cnh) this.f).h;
                a4c a4cVar5 = gm0.f;
                if (a4cVar5 != null) {
                    je9 je9Var4 = je9.d;
                    if (a4cVar5.b(je9Var4)) {
                        a4cVar5.c(je9Var4, str6, "Theme changed: updating cached layouts", null);
                    }
                }
                cnh cnhVar = (cnh) this.f;
                ((bnh) cnhVar.j.getValue()).evictAll();
                a8g a8gVar = pq3.j;
                kbc kbcVarM = a8gVar.e(cnhVar.a).m();
                int i4 = a8gVar.e(cnhVar.c.a).m().getText().d;
                Map mapSnapshot = cnhVar.b().snapshot();
                if (mapSnapshot != null) {
                    for (Map.Entry entry : mapSnapshot.entrySet()) {
                        zmh zmhVar = (zmh) entry.getKey();
                        dnh dnhVar = (dnh) entry.getValue();
                        mnh mnhVar = dnhVar.a;
                        mnh mnhVar2 = dnhVar.b;
                        vd7.h(mnhVar.a().getText(), kbcVarM);
                        mnhVar.a().getPaint().setColor(i4);
                        dnh dnhVar2 = (dnh) cnhVar.b().get(zmhVar);
                        if (dnhVar2 != null) {
                            dnhVar2.a.b(mnhVar.a());
                        }
                        if (mnhVar != mnhVar2) {
                            vd7.h(mnhVar2.a().getText(), kbcVarM);
                            mnhVar2.a().getPaint().setColor(i4);
                            dnh dnhVar3 = (dnh) cnhVar.b().get(zmhVar);
                            if (dnhVar3 != null) {
                                dnhVar3.b.b(mnhVar2.a());
                            }
                        }
                    }
                }
                return sbi.a;
            default:
                ch3.d0(obj);
                ((lbj) this.f).c = true;
                return sbi.a;
        }
    }
}
