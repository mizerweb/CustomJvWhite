package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.graphics.Bitmap;
import android.media.AudioRecord;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.a;
import one.me.android.notifications.NotificationsImagesProvider;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class wz6 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz6(lq4 lq4Var, sfe sfeVar, tda tdaVar, int i) {
        super(2, lq4Var);
        this.e = 18;
        this.h = sfeVar;
        this.i = tdaVar;
        this.f = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, s5e] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2 */
    private final Object l(Object obj) {
        Object poeVar;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        ?? r3 = this.f;
        try {
            if (r3 == 0) {
                ch3.d0(obj);
                rt2 rt2Var = (rt2) this.h;
                if (rt2Var.n == null) {
                    ef3 ef3Var = rt2Var.q;
                    String str = rt2Var.b.k0;
                    ef3Var.getClass();
                    rt2Var.n = ch3.r(str) ? null : ((lja) ef3Var.e.get()).b(str);
                }
                s5e s5eVar = rt2Var.n;
                fva fvaVar = (fva) this.i;
                if (s5eVar == null) {
                    gm0.Y(fvaVar.l, "Chat model has reaction info, but can't find preProcessed reaction in chat");
                    return sbiVar;
                }
                rt2 rt2Var2 = (rt2) this.h;
                cm7 cm7Var = fvaVar.k;
                long j = rt2Var2.a;
                long j2 = rt2Var2.b.j0;
                this.g = s5eVar;
                this.f = 1;
                poeVar = yab.K0(((n0c) cm7Var.a).b(), new pp6(cm7Var, j, j2, null), this);
                r3 = s5eVar;
                if (poeVar == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (r3 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                s5e s5eVar2 = (s5e) this.g;
                ch3.d0(obj);
                poeVar = obj;
                r3 = s5eVar2;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        ?? r11 = r3;
        fva fvaVar2 = (fva) this.i;
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V(fvaVar2.l, "Chat model has reaction info, but get exception when try find or load message", thA);
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        sfa sfaVar = (sfa) poeVar;
        if (sfaVar == null) {
            gm0.Y(((fva) this.i).l, "Chat model has reaction info, but can't find message for this reaction");
            return sbiVar;
        }
        ((fva) this.i).f.invoke(Collections.singleton(r11), new Long(sfaVar.a));
        mjg mjgVar = ((fva) this.i).s;
        j6f j6fVarA = j6f.a((j6f) mjgVar.getValue(), 0, false, false, new i6f(((rt2) this.h).b.j0, sfaVar.y(), r11), false, 23);
        mjgVar.getClass();
        mjgVar.j(null, j6fVarA);
        return sbiVar;
    }

    private final Object n(Object obj) {
        Set<String> set;
        i5b i5bVar = (i5b) this.i;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            String[] strArr = (String[]) this.h;
            Set setP1 = a.p1(Arrays.copyOf(strArr, strArr.length));
            pzf pzfVar = (pzf) i5bVar.i;
            this.g = setP1;
            this.f = 1;
            Object objEmit = pzfVar.emit(setP1, this);
            hu4 hu4Var = hu4.a;
            if (objEmit == hu4Var) {
                return hu4Var;
            }
            set = setP1;
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            set = (Set) this.g;
            ch3.d0(obj);
        }
        jl8 jl8Var = (jl8) i5bVar.d;
        ReentrantLock reentrantLock = jl8Var.e;
        reentrantLock.lock();
        try {
            List<vrb> listT1 = ww3.T1(jl8Var.d.values());
            reentrantLock.unlock();
            for (vrb vrbVar : listT1) {
                hl8 hl8Var = vrbVar.a;
                hl8Var.getClass();
                if (!(hl8Var instanceof g5b)) {
                    String[] strArr2 = vrbVar.c;
                    int length = strArr2.length;
                    Set setE = c76.a;
                    if (length != 0) {
                        if (length == 1) {
                            if (!set.isEmpty()) {
                                Iterator it = set.iterator();
                                while (it.hasNext()) {
                                    if (z5h.G0((String) it.next(), strArr2[0], true)) {
                                        setE = vrbVar.d;
                                        break;
                                    }
                                }
                            }
                        } else {
                            gof gofVar = new gof();
                            for (String str : set) {
                                for (String str2 : strArr2) {
                                    if (z5h.G0(str2, str, true)) {
                                        gofVar.add(str2);
                                        break;
                                    }
                                }
                            }
                            setE = p90.e(gofVar);
                        }
                    }
                    if (!setE.isEmpty()) {
                        vrbVar.a.b(setE);
                    }
                }
            }
            return sbi.a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    private final Object o(Object obj) throws Throwable {
        int i = this.f;
        sbi sbiVar = sbi.a;
        if (i != 0) {
            if (i == 1) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        fz6 fz6VarU = ((s7f) ((j6b) this.g).a()).u();
        l07 l07Var = new l07((y6b) this.h, 16, (ha9) this.i);
        this.f = 1;
        Object objCollect = fz6VarU.collect(new t6b(l07Var, 0), this);
        hu4 hu4Var = hu4.a;
        if (objCollect != hu4Var) {
            objCollect = sbiVar;
        }
        return objCollect == hu4Var ? hu4Var : sbiVar;
    }

    private final Object p(Object obj) {
        lmc lmcVar;
        mbb mbbVar;
        Map map;
        Map map2;
        tbb tbbVar = (tbb) this.i;
        AtomicReference atomicReference = tbbVar.m;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            mbb mbbVar2 = (mbb) atomicReference.get();
            lmcVar = (lmc) tbbVar.l.get();
            this.g = mbbVar2;
            this.h = lmcVar;
            this.f = 1;
            Object objA = tbb.a(tbbVar, this);
            hu4 hu4Var = hu4.a;
            if (objA == hu4Var) {
                return hu4Var;
            }
            mbbVar = mbbVar2;
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lmcVar = (lmc) this.h;
            mbbVar = (mbb) this.g;
            ch3.d0(obj);
        }
        if (lmcVar == null) {
            lmcVar = lmc.h;
        }
        Object obj2 = (mbbVar == null || (map2 = mbbVar.c) == null) ? null : map2.get("screen_to");
        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
        if (num != null && num.intValue() == 1) {
            Object obj3 = (mbbVar == null || (map = mbbVar.c) == null) ? null : map.get("screen_from");
            num = obj3 instanceof Integer ? (Integer) obj3 : null;
        }
        if (num == null) {
            gm0.Y(tbb.class.getName(), "Can't send WARM_START event because last screenTo is empty");
        } else {
            mbb mbbVar3 = new mbb("WARM_START", tbbVar.b(num.intValue(), mbbVar, lmcVar));
            atomicReference.updateAndGet(new cz(3, mbbVar3));
            ((ae9) tbbVar.c.getValue()).j(mbbVar3.a, mbbVar3.b, mbbVar3.c, true);
        }
        return sbi.a;
    }

    private final Object q(Object obj) {
        af7 wreVar;
        hu4 hu4Var = hu4.a;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            njd njdVar = (njd) this.g;
            NetworkRequest networkRequestA = ((kg4) this.h).a();
            if (networkRequestA == null) {
                int i2 = ((kg4) this.h).a;
                if (i2 == 1) {
                    networkRequestA = null;
                } else {
                    NetworkRequest.Builder builderRemoveCapability = new NetworkRequest.Builder().addCapability(12).addCapability(16).removeCapability(15).removeCapability(13);
                    if (Build.VERSION.SDK_INT < 30 || i2 != 6) {
                        int iD = qt4.D(i2);
                        if (iD == 2) {
                            builderRemoveCapability = builderRemoveCapability.addCapability(11);
                        } else if (iD == 3) {
                            builderRemoveCapability = builderRemoveCapability.addCapability(18);
                        } else if (iD == 4) {
                            builderRemoveCapability = builderRemoveCapability.addTransportType(0);
                        }
                        networkRequestA = builderRemoveCapability.build();
                    } else {
                        networkRequestA = builderRemoveCapability.addCapability(25).build();
                    }
                }
            }
            if (networkRequestA == null) {
                njdVar.getClass();
                njdVar.i(null);
                return sbi.a;
            }
            iaa iaaVar = new iaa(yab.i0(njdVar, null, 0, new awa((cdb) this.i, njdVar, (lq4) null, 5), 3), 16, njdVar);
            if (Build.VERSION.SDK_INT >= 30) {
                tzf tzfVar = tzf.a;
                ConnectivityManager connectivityManager = ((cdb) this.i).a;
                tzfVar.getClass();
                synchronized (tzf.b) {
                    try {
                        LinkedHashMap linkedHashMap = tzf.c;
                        boolean zIsEmpty = linkedHashMap.isEmpty();
                        linkedHashMap.put(iaaVar, networkRequestA);
                        if (zIsEmpty) {
                            n1g.x().p(byj.a, "NetworkRequestConstraintController register shared callback");
                            connectivityManager.registerDefaultNetworkCallback(tzfVar);
                        } else if (tzf.e && tzf.f != null) {
                            n1g.x().p(byj.a, "NetworkRequestConstraintController send initial capabilities");
                            iaaVar.invoke(!tzf.f.booleanValue() && networkRequestA.canBeSatisfiedBy(tzf.d) ? mg4.a : new ng4(7));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                wreVar = new xre(iaaVar, 15, connectivityManager);
            } else {
                int i3 = gd8.c;
                ConnectivityManager connectivityManager2 = ((cdb) this.i).a;
                gd8 gd8Var = new gd8(iaaVar);
                sfe sfeVar = new sfe();
                try {
                    n1g.x().p(byj.a, "NetworkRequestConstraintController register callback");
                    connectivityManager2.registerNetworkCallback(networkRequestA, gd8Var);
                    sfeVar.a = true;
                } catch (RuntimeException e) {
                    if (!e.getClass().getName().endsWith("TooManyRequestsException")) {
                        throw e;
                    }
                    n1g.x().q(byj.a, "NetworkRequestConstraintController couldn't register callback", e);
                    iaaVar.invoke(new ng4(7));
                }
                wreVar = new wre(sfeVar, connectivityManager2, gd8Var, 19);
            }
            bdb bdbVar = new bdb(0, wreVar);
            this.f = 1;
            if (np4.b(njdVar, bdbVar, this) == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }

    private final Object r(Object obj) {
        Object poeVar;
        hu4 hu4Var = hu4.a;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            qdb qdbVar = (qdb) this.i;
            try {
                qdbVar.n = String.valueOf(System.currentTimeMillis());
                Uri uriFromFile = Uri.fromFile(qdbVar.a().t(qdbVar.n));
                if (!uriFromFile.toString().startsWith("content://")) {
                    uriFromFile = qdbVar.a().i((Context) qdbVar.c.getValue(), u1m.b(uriFromFile));
                }
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                intent.putExtra("output", uriFromFile);
                intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
                poeVar = intent;
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            qdb qdbVar2 = (qdb) this.i;
            Throwable thA = roe.a(poeVar);
            if (thA != null) {
                gm0.V(qdbVar2.h, "capturePhoto: failed to capture photo", thA);
                qdbVar2.n = null;
                h8c h8cVar = (h8c) qdbVar2.e.getValue();
                h8cVar.m(new tnh(R.string.cant_open_camera));
                h8cVar.h(new w8c(R.drawable.icon_warning));
                h8cVar.p();
            }
            qdb qdbVar3 = (qdb) this.i;
            if (!(poeVar instanceof poe)) {
                pzf pzfVar = qdbVar3.j;
                fk0 fk0Var = new fk0((Intent) poeVar);
                this.h = null;
                this.g = poeVar;
                this.f = 1;
                if (pzfVar.emit(fk0Var, this) == hu4Var) {
                    return hu4Var;
                }
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }

    private final Object s(Object obj) {
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                ch3.d0(obj);
                return obj;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        NotificationsImagesProvider notificationsImagesProvider = (NotificationsImagesProvider) this.g;
        Uri uri = (Uri) this.h;
        l6g l6gVar = (l6g) this.i;
        this.f = 1;
        UriMatcher uriMatcher = NotificationsImagesProvider.a;
        Object objL0 = lvb.L0(CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, new xra(notificationsImagesProvider, uri, l6gVar, null, 4), this);
        hu4 hu4Var = hu4.a;
        return objL0 == hu4Var ? hu4Var : objL0;
    }

    private final Object t(Object obj) {
        yx6 yx6Var = (yx6) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            sfe sfeVar = new sfe();
            l7 l7Var = (l7) this.h;
            f90 f90Var = new f90(sfeVar, yx6Var, this.i, 11);
            this.g = null;
            this.f = 1;
            Object objCollect = l7Var.collect(f90Var, this);
            hu4 hu4Var = hu4.a;
            if (objCollect == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }

    private final Object u(Object obj) {
        int i;
        Future<?> future;
        njd njdVar = (njd) this.g;
        hu4 hu4Var = hu4.a;
        int i2 = this.f;
        if (i2 != 0) {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            future = (Future) this.h;
            try {
                ch3.d0(obj);
                return sbi.a;
            } catch (CancellationException e) {
                e = e;
                future.cancel(true);
                throw e;
            }
        }
        ch3.d0(obj);
        int iD = qt4.D(((zec) this.i).h);
        if (iD == 1) {
            i = ((cfc) ((zed) ((zec) this.i).k.getValue()).b.m().i()).c;
        } else if (iD == 2 || iD == 3) {
            i = ((cfc) ((zed) ((zec) this.i).k.getValue()).b.m().i()).a;
        } else {
            zec zecVar = (zec) this.i;
            String str = zecVar.j;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.g;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "Unsupported UploadType in OneVideoUploadedOperation ".concat(v0h.o(zecVar.h)), null);
                }
            }
            i = 0;
        }
        zec zecVar2 = (zec) this.i;
        String str2 = zecVar2.j;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null) {
            je9 je9Var2 = je9.d;
            if (a4cVar2.b(je9Var2)) {
                String path = zecVar2.l.getPath();
                we4 we4VarB = zecVar2.d.b();
                StringBuilder sbB = nbh.B(zecVar2.m, "Uploading file=", path, " with size=");
                sbB.append(" on network=");
                sbB.append(we4VarB);
                sbB.append(" using Uploader version ");
                sbB.append(i);
                a4cVar2.c(je9Var2, str2, sbB.toString(), null);
            }
        }
        uhi.a((uhi) ((zec) this.i).o.getValue(), ((zec) this.i).m, 0.0f, null, 24);
        zec zecVar3 = (zec) this.i;
        File file = zecVar3.l;
        ih ihVar = new ih(zecVar3, njdVar);
        String str3 = zecVar3.c;
        String strValueOf = (str3 == null || str3.length() == 0) ? String.valueOf(file.getName().hashCode()) : Uri.encode(str3);
        ExecutorService executorService = zecVar3.b;
        Future<?> futureSubmit = i == 2 ? executorService.submit(new d86(zecVar3, ihVar, strValueOf, 19)) : executorService.submit(new vk1(file, ihVar, Uri.parse(zecVar3.a), strValueOf, zecVar3.f, 4));
        try {
            this.g = null;
            this.h = futureSubmit;
            this.f = 1;
            if (np4.b(njdVar, new vbd(8), this) == hu4Var) {
                return hu4Var;
            }
            return sbi.a;
        } catch (CancellationException e2) {
            e = e2;
            future = futureSubmit;
            future.cancel(true);
            throw e;
        }
    }

    private final Object v(Object obj) {
        Object obj2;
        hu4 hu4Var;
        gu4 gu4Var = (gu4) this.g;
        int i = this.f;
        if (i != 0 && i != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        do {
            boolean zX = cqk.x(gu4Var);
            obj2 = sbi.a;
            if (!zX) {
                return obj2;
            }
            khc khcVar = (khc) this.h;
            AudioRecord audioRecord = (AudioRecord) this.i;
            this.g = gu4Var;
            this.f = 1;
            zv8[] zv8VarArr = khc.y;
            Object objK = cqk.k(new f00(khcVar, audioRecord, (lq4) null, 3), this);
            hu4Var = hu4.a;
            if (objK == hu4Var) {
                obj2 = objK;
            }
        } while (obj2 != hu4Var);
        return hu4Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                wz6 wz6Var = new wz6((xx6) this.h, (tf7) obj2, lq4Var, 0);
                wz6Var.g = obj;
                return wz6Var;
            case 1:
                return new wz6((f27) this.h, (String) obj2, lq4Var, 1);
            case 2:
                wz6 wz6Var2 = new wz6((Collection) this.h, (f37) obj2, lq4Var, 2);
                wz6Var2.g = obj;
                return wz6Var2;
            case 3:
                wz6 wz6Var3 = new wz6((f37) obj2, lq4Var, 3);
                wz6Var3.h = obj;
                return wz6Var3;
            case 4:
                wz6 wz6Var4 = new wz6((k57) obj2, lq4Var, 4);
                wz6Var4.h = obj;
                return wz6Var4;
            case 5:
                return new wz6((u87) obj2, lq4Var, 5);
            case 6:
                return new wz6((nh7) this.g, (ej7) this.h, (nh7) obj2, lq4Var, 6);
            case 7:
                return new wz6((fl7) this.h, (i64) obj2, lq4Var, 7);
            case 8:
                return new wz6((gm8) obj2, lq4Var, 8);
            case 9:
                wz6 wz6Var5 = new wz6((c59) this.h, (Uri) obj2, lq4Var, 9);
                wz6Var5.g = obj;
                return wz6Var5;
            case 10:
                return new wz6((vg9) this.g, (String) this.h, (String) obj2, lq4Var, 10);
            case 11:
                return new wz6((kl9) this.g, (rxb) this.h, (Bundle) obj2, lq4Var, 11);
            case 12:
                return new wz6((as9) this.g, (g4b) this.h, (Long) obj2, lq4Var, 12);
            case 13:
                return new wz6((List) this.g, (v9a) this.h, (x8a) obj2, lq4Var, 13);
            case 14:
                return new wz6((jsa) this.h, (i6f) obj2, lq4Var, 14);
            case 15:
                return new wz6((List) this.h, (jsa) obj2, lq4Var, 15);
            case 16:
                wz6 wz6Var6 = new wz6((jsa) this.h, (rt2) obj2, lq4Var, 16);
                wz6Var6.g = obj;
                return wz6Var6;
            case 17:
                wz6 wz6Var7 = new wz6((r07) this.h, lq4Var, (jsa) obj2, 17);
                wz6Var7.g = obj;
                return wz6Var7;
            case 18:
                wz6 wz6Var8 = new wz6(lq4Var, (sfe) this.h, (tda) obj2, this.f);
                wz6Var8.g = obj;
                return wz6Var8;
            case 19:
                return new wz6((rt2) this.h, (fva) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new wz6((String[]) this.h, (i5b) obj2, lq4Var, 20);
            case 21:
                return new wz6((j6b) this.g, (y6b) this.h, (ha9) obj2, lq4Var, 21);
            case 22:
                return new wz6((tbb) obj2, lq4Var, 22);
            case 23:
                wz6 wz6Var9 = new wz6((kg4) this.h, (cdb) obj2, lq4Var, 23);
                wz6Var9.g = obj;
                return wz6Var9;
            case 24:
                wz6 wz6Var10 = new wz6((qdb) obj2, lq4Var, 24);
                wz6Var10.h = obj;
                return wz6Var10;
            case 25:
                return new wz6((NotificationsImagesProvider) this.g, (Uri) this.h, (l6g) obj2, lq4Var, 25);
            case 26:
                wz6 wz6Var11 = new wz6((l7) this.h, lq4Var, (vfe) obj2, 26);
                wz6Var11.g = obj;
                return wz6Var11;
            case 27:
                wz6 wz6Var12 = new wz6((zec) obj2, lq4Var, 27);
                wz6Var12.g = obj;
                return wz6Var12;
            case 28:
                wz6 wz6Var13 = new wz6((khc) this.h, (AudioRecord) obj2, lq4Var, 28);
                wz6Var13.g = obj;
                return wz6Var13;
            default:
                return new wz6((pnc) this.g, (List) this.h, (hu1) obj2, lq4Var, 29);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((wz6) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((wz6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((wz6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((wz6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((wz6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((wz6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((wz6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((wz6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((wz6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((wz6) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((wz6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((wz6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((wz6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((wz6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((wz6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((wz6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((wz6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((wz6) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                ((wz6) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 19:
                return ((wz6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((wz6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 21:
                return ((wz6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 22:
                return ((wz6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 23:
                return ((wz6) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 24:
                return ((wz6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 25:
                return ((wz6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 26:
                return ((wz6) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 27:
                return ((wz6) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 28:
                return ((wz6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((wz6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:439:0x0a0d  */
    /* JADX WARN: Code duplicated, block: B:441:0x0a15  */
    /* JADX WARN: Code duplicated, block: B:466:0x0a8e  */
    /* JADX WARN: Code duplicated, block: B:469:0x0a98  */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x04bf, code lost:
    
        if (r2.emit(r0, r21) == r4) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x04ca, code lost:
    
        if (r7.emit(r5, r21) == r4) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0672, code lost:
    
        if (defpackage.yab.K0(r0, r3, r21) == r2) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x07b3, code lost:
    
        if (r1 == r10) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x081f, code lost:
    
        if (r7.a(r0, r21) == r4) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x084a, code lost:
    
        if (defpackage.yab.K0(r0, r8, r21) == r4) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0889, code lost:
    
        if (r0.a(r7, r21) == r4) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x08b4, code lost:
    
        if (defpackage.yab.K0(r0, r8, r21) == r4) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x09bd, code lost:
    
        if (r0 == r3) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v134 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [r17] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v114 */
    /* JADX WARN: Type inference failed for: r4v115 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wz6(xx6 xx6Var, lq4 lq4Var, Object obj, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = xx6Var;
        this.i = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wz6(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wz6(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wz6(Object obj, Object obj2, Object obj3, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }
}
