package defpackage;

import android.app.Activity;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.domain.model.CallingAppIds;
import com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;
import com.vk.push.core.ipc.BaseIPCClient;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import kotlin.collections.a;
import kotlinx.coroutines.TimeoutCancellationException;
import one.me.messages.list.loader.MessageModel;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.contacts.MissedContactsException;
import ru.ok.tamtam.errors.TamErrorException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class gv7 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
        this.k = obj5;
        this.l = obj6;
    }

    private final Object l(Object obj) {
        lx9 lx9Var;
        Uri uriD;
        lx9 lx9Var2;
        String str;
        File file;
        String str2;
        a4c a4cVar;
        je9 je9Var = je9.f;
        hu4 hu4Var = hu4.a;
        int i = this.f;
        try {
            if (i == 0) {
                ch3.d0(obj);
                lx9 lx9Var3 = (lx9) this.k;
                hb9 hb9Var = (hb9) this.l;
                try {
                    File fileT = ((ju6) ((rs6) lx9Var3.j.getValue())).t(String.valueOf(System.currentTimeMillis()));
                    rvc rvcVarE = lx9Var3.K().a.e(hb9Var);
                    if (rvcVarE == null || (uriD = rvcVarE.a) == null) {
                        uriD = rvcVarE != null ? rvcVarE.b : null;
                        if (uriD == null) {
                            uriD = hb9Var.d();
                        }
                    }
                    if (uriD == null) {
                        String str3 = lx9Var3.d;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                            a4cVar2.c(je9Var, str3, "media editor: onCropClicked no uri to crop", null);
                        }
                    } else {
                        Uri uriK = sb8.K(uriD.toString());
                        if (uriK != null) {
                            String absolutePath = fileT.getAbsolutePath();
                            xw4 xw4Var = (xw4) lx9Var3.o.getValue();
                            this.g = lx9Var3;
                            this.h = lx9Var3;
                            this.i = fileT;
                            this.j = absolutePath;
                            this.f = 1;
                            if (xw4Var.c(fileT, uriK, this) == hu4Var) {
                                return hu4Var;
                            }
                            lx9Var2 = lx9Var3;
                            lx9Var = lx9Var2;
                            str = absolutePath;
                            file = fileT;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    lx9Var = lx9Var3;
                    a8j.x(lx9Var.n1, new yb6(new tnh(R.string.common_error)));
                    str2 = lx9Var.d;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        a4cVar.c(je9Var, str2, "onCropClicked: io operation failed", th);
                    }
                }
                return sbi.a;
            }
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.j;
            file = (File) this.i;
            lx9Var = (lx9) this.h;
            lx9Var2 = (lx9) this.g;
            try {
                ch3.d0(obj);
            } catch (Throwable th2) {
                th = th2;
                a8j.x(lx9Var.n1, new yb6(new tnh(R.string.common_error)));
                str2 = lx9Var.d;
                a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str2, "onCropClicked: io operation failed", th);
                }
            }
            a8j.x(lx9Var2.s, new zv9(Uri.fromFile(file).toString(), str));
            return sbi.a;
        } catch (CancellationException e) {
            throw e;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, lx9] */
    private final Object n(Object obj) {
        Uri uriD;
        hb9 hb9Var;
        lx9 lx9Var;
        File file;
        je9 je9Var = je9.f;
        hu4 hu4Var = hu4.a;
        ?? r2 = this.f;
        try {
            if (r2 == 0) {
                ch3.d0(obj);
                lx9 lx9Var2 = (lx9) this.k;
                hb9 hb9Var2 = (hb9) this.l;
                File fileT = ((ju6) ((rs6) lx9Var2.j.getValue())).t(String.valueOf(System.currentTimeMillis()));
                rvc rvcVarE = lx9Var2.K().a.e(hb9Var2);
                if (rvcVarE == null || (uriD = rvcVarE.a) == null) {
                    uriD = rvcVarE != null ? rvcVarE.b : null;
                    if (uriD == null) {
                        uriD = hb9Var2.d();
                    }
                }
                if (uriD == null) {
                    String str = lx9Var2.d;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "media editor: onDrawClicked no uri to draw", null);
                    }
                } else {
                    Uri uriK = sb8.K(uriD.toString());
                    if (uriK != null) {
                        xw4 xw4Var = (xw4) lx9Var2.o.getValue();
                        this.g = lx9Var2;
                        this.h = hb9Var2;
                        this.i = lx9Var2;
                        this.j = fileT;
                        this.f = 1;
                        if (xw4Var.c(fileT, uriK, this) == hu4Var) {
                            return hu4Var;
                        }
                        hb9Var = hb9Var2;
                        lx9Var = lx9Var2;
                        file = fileT;
                    }
                }
                return sbi.a;
            }
            if (r2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            file = (File) this.j;
            hb9Var = (hb9) this.h;
            lx9Var = (lx9) this.g;
            ch3.d0(obj);
            a8j.x(lx9Var.s, new aw9(Uri.fromFile(file).toString(), hb9Var.b));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            a8j.x(r2.n1, new yb6(new tnh(R.string.common_error)));
            String str2 = r2.d;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "onDrawClicked: io operation error", th);
            }
        }
        return sbi.a;
    }

    private final Object o(Object obj) {
        q1a q1aVar;
        File fileT;
        String absolutePath;
        q1a q1aVar2;
        File file;
        String str;
        gu4 gu4Var = (gu4) this.g;
        hu4 hu4Var = hu4.a;
        int i = this.f;
        try {
            if (i == 0) {
                ch3.d0(obj);
                q1aVar = (q1a) this.k;
                kb9 kb9Var = (kb9) this.l;
                fileT = ((ju6) ((rs6) q1aVar.g.getValue())).t(String.valueOf(System.currentTimeMillis()));
                Uri uriK = sb8.K(kb9Var.b.toString());
                absolutePath = fileT.getAbsolutePath();
                if (uriK != null) {
                    xw4 xw4Var = (xw4) q1aVar.k.getValue();
                    this.g = gu4Var;
                    this.h = q1aVar;
                    this.i = fileT;
                    this.j = absolutePath;
                    this.f = 1;
                    if (xw4Var.c(fileT, uriK, this) == hu4Var) {
                        return hu4Var;
                    }
                    q1aVar2 = q1aVar;
                    file = fileT;
                    str = absolutePath;
                }
                a8j.x(q1aVar.t, new d1a(Uri.fromFile(fileT).toString(), absolutePath));
                return sbi.a;
            }
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.j;
            file = (File) this.i;
            q1aVar2 = (q1a) this.h;
            ch3.d0(obj);
            q1aVar = q1aVar2;
            absolutePath = str;
            fileT = file;
            a8j.x(q1aVar.t, new d1a(Uri.fromFile(fileT).toString(), absolutePath));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            String name = gu4Var.getClass().getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "handleCropMedia: cannot finish crop", th);
                }
            }
        }
        return sbi.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        if (r0 == r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e7, code lost:
    
        if (r1.a(r2, r0, r15, r21) == r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f8, code lost:
    
        if (r1.a(r2, r0, r15, r21) == r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0136, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object p(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gv7.p(java.lang.Object):java.lang.Object");
    }

    private final Object q(Object obj) {
        jsa jsaVar;
        List list;
        l9b l9bVar;
        gu4 gu4Var = (gu4) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            jsaVar = (jsa) this.k;
            l9b l9bVar2 = jsaVar.u2;
            list = (List) this.l;
            this.g = gu4Var;
            this.h = l9bVar2;
            this.i = jsaVar;
            this.j = list;
            this.f = 1;
            Object objB = l9bVar2.b(this);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = (List) this.j;
            jsaVar = (jsa) this.i;
            l9bVar = (l9b) this.h;
            ch3.d0(obj);
        }
        try {
            sgg sggVar = jsaVar.q2;
            if (sggVar == null || !sggVar.isActive()) {
                jsaVar.q2 = yab.i0(gu4Var, ((n0c) jsaVar.j).b(), 0, new xra(jsaVar, list, (lq4) null, 0), 2);
            }
            return sbi.a;
        } finally {
            l9bVar.g(null);
        }
    }

    private final Object r(Object obj) {
        a0b a0bVar;
        pl4 pl4Var;
        gu4 gu4Var = (gu4) this.g;
        hu4 hu4Var = hu4.a;
        int i = this.f;
        int i2 = 0;
        try {
            if (i == 0) {
                ch3.d0(obj);
                if (((ylc) this.i) == null || !((a0b) this.j).h() || !cqk.x(gu4Var)) {
                    a0b a0bVar2 = (a0b) this.j;
                    long[] jArr = (long[]) this.l;
                    synchronized (a0bVar2) {
                        a0bVar2.h.p(jArr);
                    }
                    m8b m8bVar = (m8b) this.k;
                    long[] jArr2 = (long[]) this.l;
                    int i3 = m8bVar.d;
                    int length = jArr2.length;
                    while (i2 < length) {
                        m8bVar.m(jArr2[i2]);
                        i2++;
                    }
                    return sbi.a;
                }
                ylc ylcVar = (ylc) this.i;
                rj4 rj4Var = (rj4) ylcVar.a;
                pl4 pl4Var2 = (pl4) ylcVar.b;
                a0b a0bVar3 = (a0b) this.j;
                if (rj4Var == null) {
                    long[] jArr3 = (long[]) this.l;
                    synchronized (a0bVar3) {
                        a0bVar3.h.p(jArr3);
                    }
                    return sbi.a;
                }
                xt4 xt4VarB = ((n0c) ((xhh) a0bVar3.e.getValue())).b();
                wre wreVar = new wre((a0b) this.j, rj4Var, (long[]) this.l, 22);
                this.g = null;
                this.h = pl4Var2;
                this.f = 1;
                if (qyj.V(xt4VarB, wreVar, this) == hu4Var) {
                    return hu4Var;
                }
                pl4Var = pl4Var2;
            } else {
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pl4Var = (pl4) this.h;
                try {
                    ch3.d0(obj);
                } catch (Throwable th) {
                    a0b a0bVar4 = (a0b) this.j;
                    long[] jArr4 = (long[]) this.l;
                    synchronized (a0bVar4) {
                        a0bVar4.h.p(jArr4);
                        throw th;
                    }
                }
            }
            if (pl4Var != null) {
                ((yfd) ((a0b) this.j).c.getValue()).J(pl4Var.c);
            }
            a0bVar = (a0b) this.j;
            long[] jArr5 = (long[]) this.l;
            synchronized (a0bVar) {
                a0bVar.h.p(jArr5);
                return sbi.a;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th2) {
            TamErrorException tamErrorException = th2;
            long[] jArr6 = (long[]) this.l;
            vza vzaVar = ((a0b) this.j).i;
            ArrayList arrayList = new ArrayList();
            int length2 = jArr6.length;
            while (i2 < length2) {
                long j = jArr6[i2];
                if (((Boolean) vzaVar.invoke(new Long(j))).booleanValue()) {
                    arrayList.add(new Long(j));
                }
                i2++;
            }
            if (arrayList.isEmpty()) {
                gm0.x("MissedContactsController", "request was failed but another parallel request fill contacts!", null);
                sbi sbiVar = sbi.a;
                a0b a0bVar5 = (a0b) this.j;
                long[] jArr7 = (long[]) this.l;
                synchronized (a0bVar5) {
                    a0bVar5.h.p(jArr7);
                    return sbiVar;
                }
            }
            a0b a0bVar6 = (a0b) this.j;
            m8b m8bVar2 = (m8b) this.k;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                long jLongValue = ((Number) it.next()).longValue();
                a0bVar6.j.a(jLongValue);
                m8bVar2.a(jLongValue);
            }
            MissedContactsException missedContactsException = new MissedContactsException(arrayList, tamErrorException);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "MissedContactsController", "requestContacts fail! " + ww3.z1(arrayList, null, null, null, null, 63), missedContactsException);
                }
            }
            Throwable cause = tamErrorException.getCause();
            TamErrorException tamErrorException2 = cause instanceof TamErrorException ? (TamErrorException) cause : null;
            if (tamErrorException2 != null) {
                tamErrorException = tamErrorException2;
            }
            if (TamErrorException.a(tamErrorException)) {
                throw tamErrorException;
            }
            if ((tamErrorException instanceof TamErrorException) && "not.found".equals(tamErrorException.a.b)) {
                gm0.Y("MissedContactsController", "requestContacts: exception, not found");
            }
            a0bVar = (a0b) this.j;
            long[] jArr8 = (long[]) this.l;
            synchronized (a0bVar) {
                a0bVar.h.p(jArr8);
            }
        }
    }

    private final Object s(Object obj) {
        yf5 yf5VarH;
        yf5 yf5Var;
        long[] jArr = (long[]) this.j;
        a0b a0bVar = (a0b) this.k;
        gu4 gu4Var = (gu4) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            if (jArr.length != 0 && a0bVar.h() && cqk.x(gu4Var)) {
                yf5 yf5VarH2 = yab.h(gu4Var, null, 2, new t20(a0bVar, jArr, (Long) this.l, null, 26), 1);
                yf5VarH = ((Boolean) ((zed) a0bVar.f.getValue()).b.a().a.k4.a(e5d.S6[272]).i()).booleanValue() ? yab.h(gu4Var, null, 2, new xra(a0bVar, jArr, (lq4) null, 1), 1) : null;
                List listY0 = a.Y0(new xf5[]{yf5VarH2, yf5VarH});
                this.g = null;
                this.h = yf5VarH2;
                this.i = yf5VarH;
                this.f = 1;
                Object objC = ch3.c(listY0, this);
                hu4 hu4Var = hu4.a;
                if (objC == hu4Var) {
                    return hu4Var;
                }
                yf5Var = yf5VarH2;
            }
            return null;
        }
        if (i != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        yf5VarH = (yf5) this.i;
        yf5Var = (yf5) this.h;
        ch3.d0(obj);
        rj4 rj4Var = (rj4) yf5Var.l();
        pl4 pl4Var = yf5VarH != null ? (pl4) yf5VarH.l() : null;
        if (rj4Var != null || pl4Var != null) {
            return new ylc(rj4Var, pl4Var);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    private final Object t(Object obj) {
        String str;
        xn6 xn6Var;
        a4c a4cVar;
        sbi sbiVar = sbi.a;
        je9 je9Var = je9.d;
        hu4 hu4Var = hu4.a;
        int i = this.f;
        try {
            if (i == 0) {
                ch3.d0(obj);
                yob yobVar = (yob) ((azd) this.i).i.getValue();
                xn6 xn6Var2 = (xn6) this.j;
                ilb ilbVar = xn6Var2.a;
                long j = xn6Var2.b;
                this.f = 1;
                obj = yobVar.h(ilbVar, j, this);
                if (obj != hu4Var) {
                }
                return hu4Var;
            }
            if (i == 1) {
                ch3.d0(obj);
            } else {
                if (i != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xn6Var = (xn6) this.h;
                str = (String) this.g;
                ch3.d0(obj);
            }
            a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                long j2 = xn6Var.b;
                if (gm0.c()) {
                    str = "***";
                }
                a4cVar.c(je9Var, "azd", "sendMsgDelivery SUCCESS for messageId(" + j2 + ") token=" + str, null);
                return sbiVar;
            }
            return sbiVar;
            if (((dpb) obj) == null) {
                azd azdVar = (azd) this.i;
                String str2 = (String) this.k;
                syd sydVar = (syd) this.l;
                xn6 xn6Var3 = (xn6) this.j;
                pvb pvbVar = (pvb) azdVar.g.getValue();
                h3b h3bVar = new h3b(kfc.O3, 3);
                h3bVar.h("deliveryToken", str2);
                if (sydVar != null) {
                    h3bVar.h("pdt", sydVar.a);
                }
                this.g = str2;
                this.h = xn6Var3;
                this.f = 2;
                if (pvbVar.D(h3bVar, this) != hu4Var) {
                    str = str2;
                    xn6Var = xn6Var3;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        long j3 = xn6Var.b;
                        if (gm0.c()) {
                            str = "***";
                        }
                        a4cVar.c(je9Var, "azd", "sendMsgDelivery SUCCESS for messageId(" + j3 + ") token=" + str, null);
                        return sbiVar;
                    }
                }
                return hu4Var;
            }
            xn6 xn6Var4 = (xn6) this.j;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, "azd", nbh.s(xn6Var4.b, "can't sendMsgDelivery for messageId(", ") cuz message is processed"), null);
                return sbiVar;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null) {
                je9 je9Var2 = je9.f;
                if (a4cVar3.b(je9Var2)) {
                    a4cVar3.c(je9Var2, "azd", zo5.r("sendMsgDelivery FAILED with exception=", th), th);
                }
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:81:0x0169  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:90:0x01b2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.media.MediaMetadataRetriever] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.media.MediaMetadataRetriever] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final Object u(Object obj) throws Throwable {
        Object poeVar;
        Throwable thA;
        Throwable th;
        File file;
        InputStream inputStreamOpenInputStream;
        Object objU;
        hu4 hu4Var;
        File file2;
        Throwable th2;
        ?? r2 = (Uri) this.l;
        xpf xpfVar = (xpf) this.k;
        String str = xpfVar.q;
        ny8 ny8Var = xpfVar.e;
        int i = this.f;
        sbi sbiVar = sbi.a;
        try {
            try {
                if (i == 0) {
                    ch3.d0(obj);
                    zv8[] zv8VarArr = xpf.r;
                    kp4 kp4VarF = l21.f(xpfVar.C(), r2.toString(), ((ju6) ny8Var.getValue()).b);
                    if (kp4VarF != null) {
                        long j = kp4VarF.a;
                        ic6 ic6Var = xpfVar.l;
                        if (j > 52428800) {
                            a8j.x(ic6Var, new rvf(R.drawable.icon_warning_fill, new tnh(R.string.oneme_settings_ringtone_custom_section_wrong_size)));
                        } else {
                            try {
                                ?? mediaMetadataRetriever = new MediaMetadataRetriever();
                                if (mediaMetadataRetriever instanceof AutoCloseable) {
                                    Log.w("compatUse", "early return cuz of mediaMetadataRetriever is AutoCloseable");
                                    AutoCloseable autoCloseable = (AutoCloseable) mediaMetadataRetriever;
                                    try {
                                        ?? r9 = (MediaMetadataRetriever) autoCloseable;
                                        r9.setDataSource(xpfVar.C(), r2);
                                        String strExtractMetadata = r9.extractMetadata(16);
                                        String strExtractMetadata2 = r9.extractMetadata(9);
                                        Long lValueOf = strExtractMetadata2 != null ? Long.valueOf(Long.parseLong(strExtractMetadata2)) : null;
                                        if (strExtractMetadata == null || r5h.X0(strExtractMetadata) || lValueOf == null) {
                                            xpfVar.F();
                                            r9.release();
                                            th = null;
                                        } else if (lValueOf.longValue() > 900000) {
                                            a8j.x(ic6Var, new rvf(R.drawable.icon_warning_fill, new tnh(R.string.oneme_settings_ringtone_custom_section_wrong_duration)));
                                            th = null;
                                        } else {
                                            p90.f(autoCloseable, null);
                                        }
                                        p90.f(autoCloseable, th);
                                        gm0.Y(xpf.class.getName(), "Early return in getAudioFileInfo cuz of !isValidAudio(uri)");
                                        kp4VarF = null;
                                    } catch (Throwable th3) {
                                        try {
                                            throw th3;
                                        } catch (Throwable th4) {
                                            p90.f(autoCloseable, th3);
                                            throw th4;
                                        }
                                    }
                                } else {
                                    try {
                                        mediaMetadataRetriever.setDataSource(xpfVar.C(), r2);
                                        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(16);
                                        String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(9);
                                        Long lValueOf2 = strExtractMetadata4 != null ? Long.valueOf(Long.parseLong(strExtractMetadata4)) : null;
                                        if (strExtractMetadata3 == null || r5h.X0(strExtractMetadata3) || lValueOf2 == null) {
                                            xpfVar.F();
                                            mediaMetadataRetriever.release();
                                        } else if (lValueOf2.longValue() > 900000) {
                                            a8j.x(ic6Var, new rvf(R.drawable.icon_warning_fill, new tnh(R.string.oneme_settings_ringtone_custom_section_wrong_duration)));
                                        } else {
                                            mediaMetadataRetriever.release();
                                        }
                                        mediaMetadataRetriever.release();
                                        gm0.Y(xpf.class.getName(), "Early return in getAudioFileInfo cuz of !isValidAudio(uri)");
                                        kp4VarF = null;
                                    } catch (Throwable th5) {
                                        try {
                                            throw th5;
                                        } catch (Throwable th6) {
                                            try {
                                                mediaMetadataRetriever.release();
                                                throw th6;
                                            } catch (Throwable th7) {
                                                gm0.b(th5, th7);
                                                throw th6;
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                xpfVar.F();
                                gm0.V(str, "failed to copy ringtone, e:", e);
                            }
                        }
                        if (kp4VarF != null) {
                            ju6 ju6Var = (ju6) ny8Var.getValue();
                            String str2 = kp4VarF.b;
                            ju6Var.getClass();
                            file = new File(ju6.j(ju6Var.c(), "ringtones"), l21.a(str2));
                            if (!file.exists() && (inputStreamOpenInputStream = xpfVar.C().getContentResolver().openInputStream(r2)) != null) {
                                ku6 ku6Var = ku6.b;
                                this.g = null;
                                this.h = file;
                                this.i = xpfVar;
                                this.j = inputStreamOpenInputStream;
                                this.f = 1;
                                objU = ku6Var.u(file, inputStreamOpenInputStream, this);
                                hu4Var = hu4.a;
                                if (objU == hu4Var) {
                                    return hu4Var;
                                }
                                file2 = file;
                                th2 = null;
                                r2 = inputStreamOpenInputStream;
                            }
                            xpfVar.m.put(file.getAbsolutePath(), file);
                            sa2 sa2Var = (sa2) xpfVar.g.getValue();
                            sa2Var.getClass();
                            sa2.c(sa2Var, "CALL_ADD_RINGTONE", null, null, null, null, null, false, null, 494);
                            xpfVar.G(new aqe(file.getAbsolutePath()));
                            poeVar = sbiVar;
                            thA = roe.a(poeVar);
                            if (thA != null) {
                                gm0.V(str, "failed to copy ringtone, e:", thA);
                            }
                        }
                        return sbiVar;
                    }
                    xpfVar.F();
                    kp4VarF = null;
                    if (kp4VarF != null) {
                        ju6 ju6Var2 = (ju6) ny8Var.getValue();
                        String str3 = kp4VarF.b;
                        ju6Var2.getClass();
                        file = new File(ju6.j(ju6Var2.c(), "ringtones"), l21.a(str3));
                        if (!file.exists()) {
                            ku6 ku6Var2 = ku6.b;
                            this.g = null;
                            this.h = file;
                            this.i = xpfVar;
                            this.j = inputStreamOpenInputStream;
                            this.f = 1;
                            objU = ku6Var2.u(file, inputStreamOpenInputStream, this);
                            hu4Var = hu4.a;
                            if (objU == hu4Var) {
                                return hu4Var;
                            }
                            file2 = file;
                            th2 = null;
                            r2 = inputStreamOpenInputStream;
                        }
                        xpfVar.m.put(file.getAbsolutePath(), file);
                        sa2 sa2Var2 = (sa2) xpfVar.g.getValue();
                        sa2Var2.getClass();
                        sa2.c(sa2Var2, "CALL_ADD_RINGTONE", null, null, null, null, null, false, null, 494);
                        xpfVar.G(new aqe(file.getAbsolutePath()));
                        poeVar = sbiVar;
                        thA = roe.a(poeVar);
                        if (thA != null) {
                            gm0.V(str, "failed to copy ringtone, e:", thA);
                        }
                    }
                    return sbiVar;
                }
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                InputStream inputStream = (InputStream) this.j;
                xpfVar = (xpf) this.i;
                file2 = (File) this.h;
                ch3.d0(obj);
                th2 = null;
                r2 = inputStream;
                rx8.n(r2, th2);
                file = file2;
                xpfVar.m.put(file.getAbsolutePath(), file);
                sa2 sa2Var3 = (sa2) xpfVar.g.getValue();
                sa2Var3.getClass();
                sa2.c(sa2Var3, "CALL_ADD_RINGTONE", null, null, null, null, null, false, null, 494);
                xpfVar.G(new aqe(file.getAbsolutePath()));
                poeVar = sbiVar;
            } catch (Throwable th8) {
                poeVar = new poe(th8);
            }
            thA = roe.a(poeVar);
            if (thA != null) {
                gm0.V(str, "failed to copy ringtone, e:", thA);
            }
            return sbiVar;
        } catch (Throwable th9) {
            try {
                throw th9;
            } catch (Throwable th10) {
                rx8.n(r2, th9);
                throw th10;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    private final Object v(Object obj) {
        ndh ndhVar;
        ebb ebbVar;
        ndh ndhVar2;
        ebb ebbVar2;
        ebb ebbVar3;
        ndh ndhVar3;
        Throwable cause;
        hu4 hu4Var = hu4.a;
        int i = this.f;
        ibb ibbVar = null;
        try {
            try {
                if (i == 0) {
                    ch3.d0(obj);
                    ndhVar = (ndh) this.k;
                    ebbVar = (ebb) this.l;
                    try {
                        yf5 yf5Var = ndhVar.i;
                        if (yf5Var != null) {
                            this.g = ndhVar;
                            this.h = ebbVar;
                            this.i = ebbVar;
                            this.j = ndhVar;
                            this.f = 1;
                            Object objP = yf5Var.p(this);
                            if (objP == hu4Var) {
                                return hu4Var;
                            }
                            ndhVar2 = ndhVar;
                            ebbVar3 = ebbVar;
                            obj = objP;
                            ndhVar3 = ndhVar2;
                        } else {
                            ndhVar2 = ndhVar;
                            ebbVar2 = ebbVar;
                        }
                        ndh.c(ndhVar, ibbVar, ebbVar);
                    } catch (Throwable th) {
                        th = th;
                        ndhVar2 = ndhVar;
                        if (th instanceof ExecutionException) {
                            cause = th.getCause();
                            if (cause != null) {
                                ebbVar.onFailed(cause);
                            }
                        } else {
                            ebbVar.onFailed(th);
                        }
                        if (ndhVar2.g) {
                            ndhVar2.e(ebbVar);
                            ndhVar2.f();
                        }
                        return sbi.a;
                    }
                    return sbi.a;
                }
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ndhVar2 = (ndh) this.j;
                ebbVar = (ebb) this.i;
                ebbVar3 = (ebb) this.h;
                ndhVar3 = (ndh) this.g;
                try {
                    ch3.d0(obj);
                } catch (Throwable th2) {
                    th = th2;
                    if (th instanceof ExecutionException) {
                        cause = th.getCause();
                        if (cause != null) {
                            ebbVar.onFailed(cause);
                        }
                    } else {
                        ebbVar.onFailed(th);
                    }
                    if (ndhVar2.g) {
                        ndhVar2.e(ebbVar);
                        ndhVar2.f();
                    }
                    return sbi.a;
                }
                ndh.c(ndhVar, ibbVar, ebbVar);
            } catch (Throwable th3) {
                ebbVar = ebbVar2;
                th = th3;
                if (th instanceof ExecutionException) {
                    cause = th.getCause();
                    if (cause != null) {
                        ebbVar.onFailed(cause);
                    }
                } else {
                    ebbVar.onFailed(th);
                }
                if (ndhVar2.g) {
                    ndhVar2.e(ebbVar);
                    ndhVar2.f();
                }
            }
            ibb ibbVar2 = (ibb) obj;
            ndhVar = ndhVar3;
            ebbVar2 = ebbVar;
            ebbVar = ebbVar3;
            ibbVar = ibbVar2;
            return sbi.a;
        } catch (CancellationException e) {
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
    private final Object w(Object obj) {
        ny8 ny8Var;
        ny8 ny8Var2;
        ny8 ny8Var3;
        ny8 ny8Var4;
        e1i e1iVar = (e1i) this.j;
        c7k c7kVar = e1iVar.a;
        vkb vkbVar = (vkb) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            ConcurrentHashMap concurrentHashMap = e1iVar.j;
            long j = vkbVar.a;
            vo8 vo8Var = (vo8) concurrentHashMap.remove(new Long(j));
            if (vo8Var != null) {
                ny8Var = (ny8) this.k;
                ny8Var2 = (ny8) this.l;
                vo8Var.b(null);
                int iD = qt4.D(vkbVar.d);
                if (iD == 0) {
                    ((ConcurrentHashMap) c7kVar.b).compute(Long.valueOf(j), new mw1(20, new wf0(28)));
                } else {
                    if (iD != 1) {
                        ore.o();
                        return null;
                    }
                    if (c7kVar.z(j)) {
                        pzf pzfVar = e1iVar.k;
                        w0i w0iVar = new w0i(new tnh(R.string.message_transcribe_failed));
                        this.g = vkbVar;
                        this.h = ny8Var;
                        this.i = ny8Var2;
                        this.f = 1;
                        Object objEmit = pzfVar.emit(w0iVar, this);
                        hu4 hu4Var = hu4.a;
                        if (objEmit == hu4Var) {
                            return hu4Var;
                        }
                        ny8Var3 = ny8Var;
                        ny8Var4 = ny8Var2;
                    }
                }
                ((n0i) ny8Var.getValue()).a(vkbVar.d != 1 ? 3 : 1, vkbVar.b);
                ((t51) ny8Var2.getValue()).c(new kfi(vkbVar.c, vkbVar.a, false));
            }
            return sbi.a;
        }
        if (i != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ny8Var4 = (ny8) this.i;
        ny8Var3 = (ny8) this.h;
        ch3.d0(obj);
        ny8Var = ny8Var3;
        ny8Var2 = ny8Var4;
        ((n0i) ny8Var.getValue()).a(vkbVar.d != 1 ? 3 : 1, vkbVar.b);
        ((t51) ny8Var2.getValue()).c(new kfi(vkbVar.c, vkbVar.a, false));
        return sbi.a;
    }

    private final Object x(Object obj) throws Exception {
        gu4 gu4Var;
        hu4 hu4Var = hu4.a;
        int i = this.f;
        try {
            if (i == 0) {
                ch3.d0(obj);
                gu4 gu4Var2 = (gu4) this.g;
                if (!((kmf) ((nmf) this.h).e.getValue()).c()) {
                    ore.k("Check failed.");
                    return null;
                }
                nmi nmiVar = (nmi) this.i;
                List list = (List) this.j;
                this.g = gu4Var2;
                this.f = 1;
                Object objA = nmi.a(nmiVar, list, 5000L, this);
                if (objA == hu4Var) {
                    return hu4Var;
                }
                gu4Var = gu4Var2;
                obj = objA;
            } else {
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gu4Var = (gu4) this.g;
                ch3.d0(obj);
            }
            List list2 = (List) obj;
            if (!cqk.x(gu4Var) || list2.isEmpty()) {
                if (tvj.f(4, "CXCP")) {
                    Log.i("CXCP", "Failed to get Surfaces: isActive=" + cqk.x(gu4Var) + ", surfaces=" + list2);
                }
                return Boolean.FALSE;
            }
            if (list2.isEmpty() || list2.contains(null)) {
                if (tvj.f(5, "CXCP")) {
                    Log.w("CXCP", "Surface setup failed: Some Surfaces are invalid");
                }
                ((nmf) this.h).a((wf5) ((List) this.j).get(list2.indexOf(null)));
                return Boolean.FALSE;
            }
            nmi nmiVar2 = (nmi) this.i;
            Object obj2 = nmiVar2.e;
            List list3 = (List) this.j;
            synchronized (obj2) {
                try {
                    List list4 = list3;
                    int iP0 = wm9.P0(yw3.W0(list4, 10));
                    if (iP0 < 16) {
                        iP0 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iP0);
                    for (Object obj3 : list4) {
                        Object obj4 = list2.get(list3.indexOf((wf5) obj3));
                        if (obj4 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        linkedHashMap.put((Surface) obj4, obj3);
                    }
                    nmiVar2.h = linkedHashMap;
                    nmi.b(nmiVar2);
                } catch (Throwable th) {
                    throw th;
                }
            }
            Map map = (Map) this.k;
            List list5 = (List) this.j;
            ze2 ze2Var = (ze2) this.l;
            nmi nmiVar3 = (nmi) this.i;
            for (Map.Entry entry : map.entrySet()) {
                int i2 = ((j4h) entry.getValue()).a;
                Surface surface = (Surface) list2.get(list5.indexOf(entry.getKey()));
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "Configured " + surface + " for " + ((Object) j4h.a(i2)));
                }
                ze2Var.l(i2, surface);
                nmiVar3.c.u(i2, (wf5) entry.getKey(), ze2Var);
            }
            if (tvj.f(4, "CXCP")) {
                Log.i("CXCP", "Surface setup complete");
            }
            return Boolean.TRUE;
        } catch (DeferrableSurface$SurfaceClosedException e) {
            if (tvj.f(5, "CXCP")) {
                Log.w("CXCP", "Failed to get Surfaces: Surfaces closed", e);
            }
            ((nmf) this.h).a(e.a);
            return Boolean.FALSE;
        } catch (TimeoutCancellationException unused) {
            if (tvj.f(5, "CXCP")) {
                Log.w("CXCP", "Failed to get Surfaces within 5000 ms");
            }
            return Boolean.FALSE;
        }
    }

    private final Object y(Object obj) {
        Object objB;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            dge dgeVar = (dge) ((pti) this.g).p.getValue();
            g58 g58Var = ((h8g) this.h).c;
            long j = g58Var.n;
            long j2 = g58Var.o;
            Uri uri = (Uri) this.i;
            long j3 = g58Var.a;
            this.f = 1;
            objB = dgeVar.b(j, j2, uri, j3, true, this);
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            objB = obj;
        }
        Uri uri2 = (Uri) objB;
        boolean zD = cqk.d(uri2, Uri.EMPTY);
        pti ptiVar = (pti) this.g;
        if (zD) {
            String str = ptiVar.g;
            h8g h8gVar = (h8g) this.h;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, s5h.y0("Player autoplay. Failed to refresh GIF URL,\n                                        |msgId:" + h8gVar.a + ",\n                                        |attachId:" + h8gVar.b), null);
                    return sbiVar;
                }
            }
        } else if (ptiVar.y.c(((h8g) this.h).b) == null) {
            h8g h8gVar2 = (h8g) this.h;
            g58 g58Var2 = h8gVar2.c;
            ((pti) this.g).g((tea) this.j, (z5j) this.k, h8gVar2, (MessageModel) this.l, new rm7(uri2, g58Var2.c, g58Var2.d, g58Var2.a));
            return sbiVar;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.l;
        Object obj3 = this.k;
        switch (i) {
            case 0:
                gv7 gv7Var = new gv7((u92) this.h, (Activity) this.i, (hv7) this.j, (dz4) obj3, (c95) obj2, lq4Var, 0);
                gv7Var.g = obj;
                return gv7Var;
            case 1:
                return new gv7((BaseIPCClient) this.g, (qf7) this.h, (String) this.i, (qf7) this.j, (cf7) obj3, (cf7) obj2, lq4Var, 1);
            case 2:
                return new gv7((String) this.g, (rt2) this.h, (xd3) this.i, (hla) this.j, (g4b) obj3, (Long) obj2, lq4Var, 2);
            case 3:
                return new gv7((iz5) this.h, (CharSequence) this.i, (String) this.j, (Long) obj3, (yy5) obj2, lq4Var, 3);
            case 4:
                return new gv7((p26) obj3, (kb9) obj2, lq4Var, 4);
            case 5:
                return new gv7((wfe) this.g, (wfi) this.h, (fd4) this.i, (zt6) this.j, (b41) obj3, (njd) obj2, lq4Var, 5);
            case 6:
                return new gv7(6, lq4Var, (f37) this.i, (String) this.j, (ny8) obj3, (ny8) obj2);
            case 7:
                gv7 gv7Var2 = new gv7((JsonSerializableFileDataStoreImpl) obj3, (Context) obj2, lq4Var, 7);
                gv7Var2.j = obj;
                return gv7Var2;
            case 8:
                return new gv7((lx9) obj3, (hb9) obj2, lq4Var, 8);
            case 9:
                return new gv7((lx9) obj3, (hb9) obj2, lq4Var, 9);
            case 10:
                gv7 gv7Var3 = new gv7((q1a) obj3, (kb9) obj2, lq4Var, 10);
                gv7Var3.g = obj;
                return gv7Var3;
            case 11:
                return new gv7((nma) this.g, (g4b) this.h, (q87) this.i, (ng5) this.j, (CharSequence) obj3, (Long) obj2, lq4Var, 11);
            case 12:
                gv7 gv7Var4 = new gv7((jsa) obj3, (List) obj2, lq4Var, 12);
                gv7Var4.g = obj;
                return gv7Var4;
            case 13:
                gv7 gv7Var5 = new gv7(13, lq4Var, (ylc) this.i, (a0b) this.j, (m8b) obj3, (long[]) obj2);
                gv7Var5.g = obj;
                return gv7Var5;
            case 14:
                gv7 gv7Var6 = new gv7((long[]) this.j, (a0b) obj3, (Long) obj2, lq4Var, 14);
                gv7Var6.g = obj;
                return gv7Var6;
            case 15:
                return new gv7(15, lq4Var, (azd) this.i, (xn6) this.j, (String) obj3, (syd) obj2);
            case 16:
                gv7 gv7Var7 = new gv7((xpf) obj3, (Uri) obj2, lq4Var, 16);
                gv7Var7.g = obj;
                return gv7Var7;
            case 17:
                return new gv7((ndh) obj3, (ebb) obj2, lq4Var, 17);
            case 18:
                gv7 gv7Var8 = new gv7((e1i) this.j, (ny8) obj3, (ny8) obj2, lq4Var, 18);
                gv7Var8.g = obj;
                return gv7Var8;
            case 19:
                gv7 gv7Var9 = new gv7((nmf) this.h, (nmi) this.i, (List) this.j, (Map) obj3, (ze2) obj2, lq4Var, 19);
                gv7Var9.g = obj;
                return gv7Var9;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new gv7((pti) this.g, (h8g) this.h, (Uri) this.i, (tea) this.j, (z5j) obj3, (MessageModel) obj2, lq4Var, 20);
            default:
                return new gv7(21, lq4Var, (kdk) this.i, (CallingAppIds) this.j, (AsyncCallback) obj3, (String) obj2);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((gv7) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((gv7) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((gv7) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((gv7) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((gv7) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((gv7) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((gv7) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((gv7) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((gv7) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((gv7) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((gv7) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((gv7) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((gv7) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((gv7) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((gv7) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((gv7) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((gv7) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((gv7) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((gv7) create((vkb) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((gv7) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((gv7) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((gv7) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01e8 A[Catch: all -> 0x011f, TryCatch #14 {all -> 0x011f, blocks: (B:68:0x0113, B:99:0x01df, B:101:0x01e8, B:103:0x01ed), top: B:362:0x00ff }] */
    /* JADX WARN: Code duplicated, block: B:160:0x0386  */
    /* JADX WARN: Code duplicated, block: B:162:0x039a  */
    /* JADX WARN: Code duplicated, block: B:163:0x039c  */
    /* JADX WARN: Code duplicated, block: B:167:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:170:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:264:0x0600 A[Catch: Exception -> 0x053f, CancellationException -> 0x0542, PHI: r5
  0x0600: PHI (r5v9 gv7) = (r5v8 gv7), (r5v0 gv7) binds: [B:262:0x05fc, B:236:0x0545] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #15 {CancellationException -> 0x0542, Exception -> 0x053f, blocks: (B:231:0x053a, B:236:0x0545, B:264:0x0600, B:239:0x054e, B:258:0x05b5, B:243:0x0559, B:249:0x058b, B:251:0x058f, B:255:0x0597, B:246:0x0562), top: B:364:0x051e }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0085  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c5 A[Catch: all -> 0x0202, TRY_LEAVE, TryCatch #2 {all -> 0x0202, blocks: (B:93:0x01bd, B:95:0x01c5), top: B:350:0x01bd }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01da  */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fb, code lost:
    
        if (com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl.m21access$writeUnsafegIAlus(r3, r0, r5) == r7) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0625, code lost:
    
        if (r1.emit(r0, r5) == r11) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x066c, code lost:
    
        if (r0.emit(r1, r5) == r11) goto L279;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v56, types: [com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl] */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v101 */
    /* JADX WARN: Type inference failed for: r2v102 */
    /* JADX WARN: Type inference failed for: r2v103 */
    /* JADX WARN: Type inference failed for: r2v73 */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r2v75, types: [j9b] */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [j9b] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gv7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv7(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.k = obj;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv7(Object obj, Object obj2, Object obj3, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
        this.k = obj4;
        this.l = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv7(int i, lq4 lq4Var, Object obj, Object obj2, Object obj3, Object obj4) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
        this.l = obj4;
    }
}
