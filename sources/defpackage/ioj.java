package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.a;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* JADX INFO: loaded from: classes3.dex */
public final class ioj extends a8j {
    public static final /* synthetic */ zv8[] V1 = {new z8b(ioj.class, "reloadWebAppJob", "getReloadWebAppJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, ioj.class, "openInternalLinkJob", "getOpenInternalLinkJob()Lkotlinx/coroutines/Job;"), new z8b(ioj.class, "sharingMaxJob", "getSharingMaxJob()Lkotlinx/coroutines/Job;"), new z8b(ioj.class, "verifyMobileIdJob", "getVerifyMobileIdJob()Lkotlinx/coroutines/Job;"), new z8b(ioj.class, "rootUrlJob", "getRootUrlJob()Lkotlinx/coroutines/Job;")};
    public static final String[] W1 = {"image/*", "video/*"};
    public static final HashSet X1;
    public final ny8 A;
    public final pzf A1;
    public final ny8 B;
    public final bye B1;
    public final String C;
    public final ic6 C1;
    public jdj D;
    public final ifh D1;
    public final p3c E;
    public final ny8 E1;
    public final p3c F;
    public final ifh F1;
    public final js8 G;
    public final ny8 G1;
    public final AtomicBoolean H;
    public final mjg H1;
    public final mjg I;
    public final r8e I1;
    public final mjg J;
    public es8 J1;
    public final mjg K;
    public ehj K1;
    public rpj L1;
    public qpj M1;
    public pgj N1;
    public es8 O1;
    public final ConcurrentHashMap P1;
    public sgg Q1;
    public final ConcurrentHashMap R1;
    public final ifh S1;
    public final p3c T1;
    public long U1;
    public final mjg X;
    public final boolean Y;
    public final ev Z;
    public final long c;
    public final bdj d;
    public final Long e;
    public final String f;
    public final ooj g;
    public final stj h;
    public final qsj i;
    public final et3 j;
    public final iv4 k;
    public final zl7 l;
    public final wo6 m;
    public final ny8 n;
    public final mjg n1;
    public final ny8 o;
    public boolean o1;
    public final ny8 p;
    public boolean p1;
    public final ny8 q;
    public boolean q1;
    public final ny8 r;
    public volatile String r1;
    public final ny8 s;
    public volatile String s1;
    public final ny8 t;
    public final p3c t1;
    public final ny8 u;
    public final p3c u1;
    public final ny8 v;
    public final mjg v1;
    public final ifh w;
    public final jz w1;
    public final ny8 x;
    public final r8e x1;
    public final ny8 y;
    public final r8e y1;
    public final ny8 z;
    public final r8e z1;

    static {
        HashSet hashSet = new HashSet(wm9.P0(5));
        a.l1(new String[]{"WebAppMaxShare", "WebAppShare", "WebAppDownloadFile", "WebAppOpenLink", "WebAppOpenMaxLink"}, hashSet);
        X1 = hashSet;
    }

    public ioj(long j, bdj bdjVar, Long l, String str, ooj oojVar, String str2, ifh ifhVar, stj stjVar, qsj qsjVar, et3 et3Var, iv4 iv4Var, zl7 zl7Var, wo6 wo6Var, is8 is8Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, ny8 ny8Var13, ny8 ny8Var14, ny8 ny8Var15, wd4 wd4Var, ny8 ny8Var16, ny8 ny8Var17, ny8 ny8Var18) {
        jz0 jz0Var;
        String str3;
        je9 je9Var = je9.d;
        this.c = j;
        this.d = bdjVar;
        this.e = l;
        this.f = str;
        this.g = oojVar;
        this.h = stjVar;
        this.i = qsjVar;
        this.j = et3Var;
        this.k = iv4Var;
        this.l = zl7Var;
        this.m = wo6Var;
        this.n = ny8Var;
        this.o = ny8Var2;
        this.p = ny8Var4;
        this.q = ny8Var5;
        this.r = ny8Var7;
        this.s = ny8Var8;
        this.t = ny8Var9;
        this.u = ny8Var10;
        this.v = ny8Var11;
        this.w = ifhVar;
        this.x = ny8Var16;
        this.y = rx8.P(3, new eke(ny8Var6, 7));
        this.z = ny8Var14;
        this.A = ny8Var15;
        this.B = ny8Var18;
        String name = ioj.class.getName();
        this.C = name;
        this.E = qyj.S();
        this.F = qyj.S();
        dq4 dq4Var = this.b;
        xhh xhhVar = (xhh) is8Var.a.getValue();
        List list = is8Var.b;
        asj asjVar = is8Var.c;
        ny8 ny8Var19 = is8Var.d;
        js8 js8Var = new js8();
        js8Var.a = dq4Var;
        js8Var.b = xhhVar;
        js8Var.c = list;
        js8Var.d = asjVar;
        ArrayList arrayListH1 = ww3.H1(asjVar, list);
        js8Var.e = ny8Var19;
        js8Var.f = yab.b(0, 0, null, 7);
        ArrayList arrayList = new ArrayList(yw3.W0(arrayListH1, 10));
        Iterator it = arrayListH1.iterator();
        while (it.hasNext()) {
            arrayList.add(e9i.q0(((os8) it.next()).d()));
        }
        int i = zz6.a;
        e9i.j0(e9i.T(new fz6(new nr2(arrayList, k66.a, -2, 1, 1), new af8(js8Var, null, 2), 3), ((n0c) ((xhh) js8Var.b)).b()), (gu4) js8Var.a);
        this.G = js8Var;
        this.H = new AtomicBoolean(false);
        mjg mjgVarA = p90.a(null);
        this.I = mjgVarA;
        koj kojVar = oojVar != null ? oojVar.c : null;
        noj nojVar = kojVar instanceof noj ? (noj) kojVar : null;
        mjg mjgVarA2 = p90.a(Boolean.valueOf(nojVar != null ? nojVar.a : false));
        this.J = mjgVarA2;
        mjg mjgVarA3 = p90.a(Boolean.valueOf(oojVar != null ? oojVar.e : false));
        this.K = mjgVarA3;
        mjg mjgVarA4 = p90.a(Boolean.valueOf(oojVar != null ? oojVar.f : false));
        this.X = mjgVarA4;
        boolean zD = ((m8b) ((f5d) wo6Var).a.g4.a(e5d.S6[268]).i()).d(j);
        this.Y = zD;
        this.Z = new ev(this, false, 20);
        r07 r07Var = new r07(e9i.k0(mjgVarA, new dk3(2, null, 9)), mjgVarA2, new b42(this, null, 2), 0);
        cu2 cu2Var = new cu2(new jz(((no4) ny8Var3.getValue()).j(j), 13), 12);
        Boolean bool = Boolean.FALSE;
        a8g a8gVar = j0g.a;
        r8e r8eVarG0 = e9i.G0(cu2Var, this.b, a8gVar, bool);
        mjg mjgVarA5 = p90.a((oojVar == null || (str3 = oojVar.a) == null) ? str2 == null ? "" : str2 : str3);
        this.n1 = mjgVarA5;
        this.q1 = true;
        this.t1 = qyj.S();
        this.u1 = qyj.S();
        mjg mjgVarA6 = p90.a((oojVar != null ? oojVar.d : null) == null ? null : new ali(oojVar.d, true));
        this.v1 = mjgVarA6;
        this.w1 = new jz(mjgVarA6, 13);
        r8e r8eVar = new r8e(mjgVarA4);
        this.x1 = r8eVar;
        r8e r8eVarG1 = e9i.G0(new zhi(new xx6[]{mjgVarA5, r8eVarG0, r07Var, mjgVarA6, mjgVarA3, r8eVar}, 5, this), this.b, a8gVar, oojVar);
        this.y1 = r8eVarG1;
        this.z1 = e9i.G0(e9i.T(new hz1(r8eVarG1, 14), ((n0c) ((xhh) ny8Var.getValue())).a()), this.b, a8gVar, null);
        pzf pzfVarB = e9i.b(1, Integer.MAX_VALUE, 4);
        this.A1 = pzfVarB;
        this.B1 = new bye(new lyd(new q8e(pzfVarB), null, 1));
        this.C1 = new ic6(null);
        this.D1 = new ifh(new aa7(this, ny8Var11, ny8Var12, ny8Var, ny8Var13, 3));
        final int i2 = 0;
        this.E1 = rx8.P(3, new af7(this) { // from class: znj
            public final /* synthetic */ ioj b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                ioj iojVar = this.b;
                switch (i3) {
                    case 0:
                        return iojVar.C().m;
                    default:
                        return ((skj) iojVar.F1.getValue()).e;
                }
            }
        });
        this.F1 = new ifh(new j0i(ny8Var17, 17, this));
        final int i3 = 1;
        this.G1 = rx8.P(3, new af7(this) { // from class: znj
            public final /* synthetic */ ioj b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                ioj iojVar = this.b;
                switch (i4) {
                    case 0:
                        return iojVar.C().m;
                    default:
                        return ((skj) iojVar.F1.getValue()).e;
                }
            }
        });
        mjg mjgVarA7 = p90.a(null);
        this.H1 = mjgVarA7;
        this.I1 = new r8e(mjgVarA7);
        this.P1 = new ConcurrentHashMap();
        this.R1 = new ConcurrentHashMap();
        this.S1 = new ifh(new o0j(22));
        p3c p3cVarS = qyj.S();
        this.T1 = p3cVarS;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            jz0Var = null;
            a4cVar.c(je9Var, name, "init: " + j + " " + l + " " + oojVar + ", hash: " + hashCode(), null);
        } else {
            jz0Var = null;
        }
        if (oojVar == null) {
            p3cVarS.B(this, V1[4], a8j.t(this, jz0Var, new boj(this, jz0Var, 0), 1));
            if (!wd4Var.h()) {
                mjgVarA.setValue(llc.a);
            }
        }
        e9i.j0(e9i.T(new fz6(e9i.q0((p41) js8Var.f), new rea(2, this, ioj.class, "processEvent", "processEvent(Lone/me/webapp/domain/jsbridge/JsBridgeActions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 25), 3), ((n0c) D()).a()), this.b);
        if (zD) {
            yjj yjjVar = (yjj) ny8Var15.getValue();
            Context context = (Context) ny8Var11.getValue();
            yjjVar.getClass();
            yjjVar.d = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addTransportType(0).addCapability(12).build();
            ConnectivityManager connectivityManager = yjjVar.d;
            if (connectivityManager != null) {
                connectivityManager.requestNetwork(networkRequestBuild, yjjVar.h);
            }
            String name2 = yjj.class.getName();
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, name2, "WebAppHttpClient registered", null);
            }
        }
    }

    public static String B(String str, String str2) {
        if (str == null || str.length() == 0) {
            return str2 == null ? "" : str2;
        }
        return (str2 == null || str2.length() == 0) ? str : zo5.p(str, "\n", str2);
    }

    public static void P(ioj iojVar, String str, String str2, int i) {
        String str3 = (i & 1) != 0 ? null : str;
        String str4 = (i & 2) != 0 ? null : str2;
        boolean z = (i & 4) == 0;
        iojVar.getClass();
        iojVar.E.B(iojVar, V1[0], a8j.t(iojVar, null, new q40(iojVar, str3, z, str4, (lq4) null, 8), 1));
    }

    public final rej C() {
        return (rej) this.D1.getValue();
    }

    public final xhh D() {
        return (xhh) this.n.getValue();
    }

    public final ju6 E() {
        return (ju6) this.u.getValue();
    }

    public final Object F(String str, String str2, mdh mdhVar) {
        Boolean bool = Boolean.FALSE;
        mjg mjgVar = this.J;
        mjgVar.getClass();
        mjgVar.j(null, bool);
        mjg mjgVar2 = this.K;
        mjgVar2.getClass();
        mjgVar2.j(null, bool);
        this.D = null;
        Iterator it = ((List) this.G.c).iterator();
        while (it.hasNext()) {
            ((os8) it.next()).b(null);
        }
        Object objK0 = yab.K0(((n0c) D()).b(), new f1j(this, str, str2, (lq4) null, 17), mdhVar);
        return objK0 == hu4.a ? objK0 : sbi.a;
    }

    public final boolean G(ynj ynjVar) {
        return this.A1.a(ynjVar);
    }

    public final void H() {
        String str = this.C;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "try reload by click", null);
            }
        }
        P(this, null, null, 7);
    }

    public final void I(String str, String str2, boolean z) {
        je9 je9Var = je9.f;
        if (z && !this.Y) {
            String str3 = this.C;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str3, ewi.d(this.c, "onJsEvent: Private bridge event is not allowed for this bot=", " and such method=", str), null);
                return;
            }
            return;
        }
        if (!a.M0(this.c, (long[]) ((f5d) this.m).a.W2.a(e5d.S6[206]).i()) && X1.contains(str) && System.currentTimeMillis() - this.U1 >= CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS) {
            String str4 = this.C;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str4, "Did not execute js bridge method: no user click in the last 3000 ms", null);
                return;
            }
            return;
        }
        String str5 = this.C;
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null) {
            je9 je9Var2 = je9.d;
            if (a4cVar3.b(je9Var2)) {
                long j = this.c;
                int iHashCode = hashCode();
                StringBuilder sbQ = qv1.q("onJsEvent: name: ", str, ", data: ", str2, ", isPrivateEvent: ");
                sbQ.append(z);
                sbQ.append(", botId: ");
                sbQ.append(j);
                a4cVar3.c(je9Var2, str5, zo5.v(sbQ, ", hash: ", iHashCode), null);
            }
        }
        js8 js8Var = this.G;
        yab.i0((gu4) js8Var.a, ((n0c) ((xhh) js8Var.b)).a(), 0, new q40(js8Var, str, z, str2, (lq4) null, 2), 2);
    }

    public final void J(boolean z) {
        rej rejVarC = C();
        yab.i0(rejVarC.c, null, 0, new hej(null, rejVarC, z), 3);
    }

    public final void K() {
        String str = this.C;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, c0a.n(this.I.getValue(), "onPageLoadingError: "), null);
            }
        }
        mjg mjgVar = this.I;
        llc llcVar = llc.a;
        mjgVar.getClass();
        mjgVar.j(null, llcVar);
    }

    public final void L(String str, boolean z) {
        String str2 = this.C;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, qt4.n("onPageStartLoading: ", str, " ", z), null);
            }
        }
        G(vnj.a);
        ali aliVar = (ali) this.v1.getValue();
        if (!cqk.d(aliVar != null ? aliVar.a : null, str) || z) {
            mjg mjgVar = this.I;
            mlc mlcVar = mlc.a;
            mjgVar.getClass();
            mjgVar.j(null, mlcVar);
        }
    }

    public final void M(boolean z) {
        ehj ehjVar = this.K1;
        if (z) {
            if (ehjVar != null) {
                ehjVar.a(sbi.a);
            }
        } else if (ehjVar != null) {
            ehjVar.b(new fhj());
        }
        this.K1 = null;
    }

    public final void N(boolean z) {
        es8 es8Var = this.J1;
        if (es8Var == null) {
            gm0.Y(ioj.class.getName(), "Early return in onRequestPhoneResult cuz of requestPhoneActionResult is null");
        } else {
            if (!z) {
                es8Var.b(new imj());
                return;
            }
            yab.i0(this.b, ((n0c) D()).b(), 0, new oli(this, es8Var, null, 16), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008d, code lost:
    
        if (r11 == r8) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d7, code lost:
    
        if (r11 == r8) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0121, code lost:
    
        if (r11 == r8) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0169, code lost:
    
        if (r11 == r8) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object O(defpackage.kqg r10, defpackage.lq4 r11) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ioj.O(kqg, lq4):java.lang.Object");
    }

    public final void Q() {
        G(lnj.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    public final void R(byte[] bArr, String str) throws IOException {
        String mimeTypeFromExtension;
        Uri uriInsert;
        int iY0;
        if (str == null || str.length() == 0 || (iY0 = r5h.Y0(str, '.', 0, 6)) == -1) {
            mimeTypeFromExtension = null;
        } else {
            mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(iY0 + 1).toLowerCase(Locale.ROOT));
            if (mimeTypeFromExtension == null) {
                mimeTypeFromExtension = "*/*";
            }
        }
        String str2 = mimeTypeFromExtension != null ? mimeTypeFromExtension : "*/*";
        String str3 = Environment.DIRECTORY_DOWNLOADS;
        E().getClass();
        String str4 = str3 + "/MAX";
        ny8 ny8Var = this.v;
        ContentResolver contentResolver = ((Context) ny8Var.getValue()).getContentResolver();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str);
            contentValues.put("mime_type", str2);
            contentValues.put("relative_path", str4);
            contentValues.put("is_pending", (Integer) 1);
            contentValues.put("_size", Integer.valueOf(bArr.length));
            uriInsert = contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
            if (uriInsert != null) {
                OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                if (outputStreamOpenOutputStream != null) {
                    try {
                        outputStreamOpenOutputStream.write(bArr);
                        outputStreamOpenOutputStream.close();
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("is_pending", (Integer) 0);
                        contentResolver.update(uriInsert, contentValues2, null, null);
                        return;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            rx8.n(outputStreamOpenOutputStream, th);
                            throw th2;
                        }
                    }
                }
            } else {
                uriInsert = null;
            }
        } else {
            uriInsert = null;
        }
        File fileK = E().k(str);
        File parentFile = fileK.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        lu6.r0(fileK, bArr);
        if (uriInsert != null) {
            contentResolver.delete(uriInsert, null, null);
        }
        if (i < 29) {
            MediaScannerConnection.scanFile((Context) ny8Var.getValue(), new String[]{fileK.getAbsolutePath()}, new String[]{str2}, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object S(qrj qrjVar, lq4 lq4Var) {
        eoj eojVar;
        boolean z;
        if (lq4Var instanceof eoj) {
            eojVar = (eoj) lq4Var;
            int i = eojVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                eojVar.h = i - Integer.MIN_VALUE;
            } else {
                eojVar = new eoj(this, lq4Var);
            }
        } else {
            eojVar = new eoj(this, lq4Var);
        }
        Object obj = eojVar.f;
        int i2 = eojVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            boolean z2 = qrjVar.c;
            lk9 lk9VarS0 = ((n0c) D()).c().S0();
            in inVar = new in(this, z2, null, 8);
            eojVar.d = qrjVar;
            eojVar.e = z2;
            eojVar.h = 1;
            Object objK0 = yab.K0(lk9VarS0, inVar, eojVar);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
            z = z2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = eojVar.e;
            qrjVar = eojVar.d;
            ch3.d0(obj);
        }
        qrjVar.a(Boolean.valueOf(z));
        return sbi.a;
    }

    public final void T() {
        if (!((wsc) this.t.getValue()).c(wsc.n)) {
            G(bnj.a);
            return;
        }
        yab.i0(this.b, ((n0c) D()).b(), 0, new foj(this, null, 0), 2);
    }

    public final boolean U(String str) {
        String str2 = this.r1;
        boolean zD = str2 != null ? cqk.d(str, str2) : false;
        if (!zD) {
            this.k.a(null, new al8(str2 == null || str2.length() == 0, this.c, hashCode()));
        }
        return zD;
    }

    @Override // defpackage.a8j
    public final void y() {
        if (this.Y) {
            yjj yjjVar = (yjj) this.A.getValue();
            ConnectivityManager connectivityManager = yjjVar.d;
            if (connectivityManager != null) {
                connectivityManager.unregisterNetworkCallback(yjjVar.h);
            }
            yjjVar.d = null;
            String str = yjjVar.g;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "WebAppHttpClient unregistered", null);
                }
            }
        }
        bij bijVar = (bij) this.y.getValue();
        ((t51) bijVar.a.getValue()).f(bijVar);
        this.D = null;
        Iterator it = ((List) this.G.c).iterator();
        while (it.hasNext()) {
            ((os8) it.next()).b(null);
        }
    }
}
