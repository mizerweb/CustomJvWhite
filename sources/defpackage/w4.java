package defpackage;

import android.graphics.Bitmap;
import android.text.Spannable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.KotlinNothingValueException;
import one.me.chats.list.ChatsListWidget;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public class w4 implements btb, a10, f96, u9, iri, ip8, rxe, j9j, whe {
    public Object a;

    public w4(int i, boolean z) {
        switch (i) {
            case 8:
                this.a = Collections.synchronizedSet(new LinkedHashSet());
                break;
            case 19:
                this.a = new LinkedHashSet();
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                this.a = new ifh(new a5d(13));
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }

    public static w4 m(int i, int i2, int i3) {
        return new w4(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }

    @Override // defpackage.f96
    public boolean A() {
        ChatsListWidget chatsListWidget = (ChatsListWidget) this.a;
        zv8[] zv8VarArr = ChatsListWidget.X;
        return ((wh3) chatsListWidget.t1().z1.a.getValue()).b;
    }

    @Override // defpackage.rxe
    public qxe a(String str) {
        dbh dbhVar = (dbh) this.a;
        String databaseName = dbhVar.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                c.o(c0a.o("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str) && !r5h.r1('/', databaseName, databaseName).equals(r5h.r1('/', str, str))) {
            throw new IllegalArgumentException(("This driver is configured to open a database named '" + dbhVar.getDatabaseName() + "' but '" + str + "' was requested.").toString());
        }
        return new abh(dbhVar.getWritableDatabase());
    }

    @Override // defpackage.whe
    public void accept(Object obj, Object obj2) {
        ((rlk) ((xlk) obj).p()).n0((mlh) this.a);
        ((qjh) obj2).b(null);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ip8
    public void b(p76 p76Var, int i) {
        zme zmeVar = (zme) this.a;
        lq0 lq0Var = zmeVar.b;
        if (p76Var == null) {
            lq0Var.g(i, null);
            return;
        }
        y78 y78Var = zmeVar.d;
        p76Var.Y();
        x78 x78VarCreateImageTranscoder = y78Var.createImageTranscoder(p76Var.b, zmeVar.c);
        x78VarCreateImageTranscoder.getClass();
        es0 es0Var = zmeVar.e;
        pjd pjdVar = es0Var.c;
        pjdVar.a(es0Var, "ResizeAndRotateProducer");
        v78 v78Var = es0Var.a;
        qg7 qg7Var = zmeVar.h.b;
        qg7Var.getClass();
        dba dbaVar = new dba((waa) qg7Var.b);
        try {
            try {
                iue iueVar = v78Var.i;
                bne bneVar = v78Var.h;
                p76Var.Y();
                ww6 ww6VarC = x78VarCreateImageTranscoder.c(p76Var, dbaVar, iueVar, bneVar, p76Var.i);
                if (ww6VarC.l() == 2) {
                    throw new RuntimeException("Error while transcoding the image");
                }
                h98 h98VarM = zmeVar.m(p76Var, v78Var.h, ww6VarC, x78VarCreateImageTranscoder.a());
                g95 g95VarY = au3.Y(dbaVar.y());
                try {
                    p76 p76Var2 = new p76(g95VarY);
                    p76Var2.b = kb5.a;
                    try {
                        p76Var2.W();
                        pjdVar.d(es0Var, "ResizeAndRotateProducer", h98VarM);
                        if (ww6VarC.l() != 1) {
                            i |= 16;
                        }
                        lq0Var.g(i, p76Var2);
                        p76Var2.close();
                        g95VarY.close();
                        dbaVar.close();
                    } catch (Throwable th) {
                        p76Var2.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    au3.E(g95VarY);
                    throw th2;
                }
            } catch (Exception e) {
                pjdVar.b(es0Var, "ResizeAndRotateProducer", e, null);
                if (lq0.a(i)) {
                    lq0Var.e(e);
                }
                dbaVar.close();
            }
        } catch (Throwable th3) {
            dbaVar.close();
            throw th3;
        }
    }

    @Override // defpackage.u9
    public void c(Object obj) {
        t9 t9Var = (t9) obj;
        c cVar = (c) this.a;
        db7 db7Var = (db7) cVar.E.pollFirst();
        if (db7Var == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = db7Var.a;
        int i = db7Var.b;
        a aVarC = cVar.c.c(str);
        if (aVarC != null) {
            aVarC.t(i, t9Var.a, t9Var.b);
            return;
        }
        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
    }

    @Override // defpackage.iri
    public int d(Object obj) {
        return ((iri) this.a).d(((qu4) obj).b.K());
    }

    public d25 e() {
        d25 d25Var = new d25((LinkedHashMap) this.a);
        f55.y(d25Var);
        return d25Var;
    }

    @Override // defpackage.j9j
    public i9j g(ybb ybbVar) {
        return new fbc(this, ybbVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public void h(k30 k30Var, nq4 nq4Var) throws Throwable {
        qrb qrbVar;
        if (nq4Var instanceof qrb) {
            qrbVar = (qrb) nq4Var;
            int i = qrbVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                qrbVar.f = i - Integer.MIN_VALUE;
            } else {
                qrbVar = new qrb(this, nq4Var);
            }
        } else {
            qrbVar = new qrb(this, nq4Var);
        }
        Object obj = qrbVar.d;
        int i2 = qrbVar.f;
        if (i2 != 0) {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                ch3.d0(obj);
                throw new KotlinNothingValueException();
            }
        }
        ch3.d0(obj);
        mjg mjgVar = (mjg) this.a;
        qrbVar.f = 1;
        mjgVar.collect(k30Var, qrbVar);
    }

    @Override // defpackage.j9j
    public ybb i(int i) {
        List list = (List) ((SparseArray) this.a).get(i);
        if (list != null && !list.isEmpty()) {
            return (ybb) list.get(0);
        }
        ore.p(zo5.h(i, "Cannot find the wrapper for global view type "));
        return null;
    }

    public au3 j(Bitmap bitmap, ine ineVar) {
        return au3.k0(bitmap, ineVar, (v56) this.a);
    }

    @Override // defpackage.rxe
    public boolean k() {
        return true;
    }

    public au3 l(Closeable closeable) {
        v56 v56Var = (v56) this.a;
        if (closeable == null) {
            return null;
        }
        v56Var.v();
        if (!(closeable instanceof Bitmap)) {
            boolean z = closeable instanceof xt3;
        }
        return new g95(closeable, au3.e, v56Var, null, true);
    }

    public void n(Object obj, String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        if (obj == null) {
            obj = null;
        } else {
            sr3 sr3VarA = zfe.a(obj.getClass());
            if (!sr3VarA.equals(zfe.a(Boolean.TYPE)) && !sr3VarA.equals(zfe.a(Byte.TYPE)) && !sr3VarA.equals(zfe.a(Integer.TYPE)) && !sr3VarA.equals(zfe.a(Long.TYPE)) && !sr3VarA.equals(zfe.a(Float.TYPE)) && !sr3VarA.equals(zfe.a(Double.TYPE)) && !sr3VarA.equals(zfe.a(String.class)) && !sr3VarA.equals(zfe.a(Boolean[].class)) && !sr3VarA.equals(zfe.a(Byte[].class)) && !sr3VarA.equals(zfe.a(Integer[].class)) && !sr3VarA.equals(zfe.a(Long[].class)) && !sr3VarA.equals(zfe.a(Float[].class)) && !sr3VarA.equals(zfe.a(Double[].class)) && !sr3VarA.equals(zfe.a(String[].class))) {
                if (sr3VarA.equals(zfe.a(boolean[].class))) {
                    obj = f35.a((boolean[]) obj);
                } else if (sr3VarA.equals(zfe.a(byte[].class))) {
                    obj = f35.b((byte[]) obj);
                } else if (sr3VarA.equals(zfe.a(int[].class))) {
                    obj = f35.e((int[]) obj);
                } else if (sr3VarA.equals(zfe.a(long[].class))) {
                    obj = f35.f((long[]) obj);
                } else if (sr3VarA.equals(zfe.a(float[].class))) {
                    obj = f35.d((float[]) obj);
                } else {
                    if (!sr3VarA.equals(zfe.a(double[].class))) {
                        c.v("Key ", str, " has invalid type ", sr3VarA);
                        return;
                    }
                    obj = f35.c((double[]) obj);
                }
            }
        }
        linkedHashMap.put(str, obj);
    }

    @Override // defpackage.f96
    public void o() {
        ChatsListWidget chatsListWidget = (ChatsListWidget) this.a;
        zv8[] zv8VarArr = ChatsListWidget.X;
        chatsListWidget.t1().f.v();
    }

    public void p(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            n(entry.getValue(), (String) entry.getKey());
        }
    }

    @Override // defpackage.a10
    public void q(long j, List list) {
        y10 y10Var = (y10) this.a;
        y10Var.H();
        y10Var.j(list, j, true, false, false);
    }

    public void r(String str, String str2) {
        ((LinkedHashMap) this.a).put(str, str2);
    }

    @Override // defpackage.btb
    public ixj s(View view, ixj ixjVar) {
        rq rqVar = (rq) this.a;
        WeakHashMap weakHashMap = i7j.a;
        ixj ixjVar2 = rqVar.getFitsSystemWindows() ? ixjVar : null;
        if (!Objects.equals(rqVar.g, ixjVar2)) {
            rqVar.g = ixjVar2;
            rqVar.setWillNotDraw(!(rqVar.v != null && rqVar.getTopInset() > 0));
            rqVar.requestLayout();
        }
        return ixjVar;
    }

    public int t(int i) {
        int i2;
        feg fegVar;
        feg[] fegVarArr = (feg[]) this.a;
        int length = fegVarArr.length - 1;
        int i3 = 0;
        while (i3 <= length && (fegVar = fegVarArr[(i2 = (i3 + length) >>> 1)]) != null) {
            int i4 = fegVar.b;
            int i5 = fegVar.a;
            if (i >= i5 && i < i4) {
                return i2;
            }
            if (i4 <= i) {
                i3 = i2 + 1;
            } else if (i5 > i) {
                length = i2 - 1;
            }
        }
        return -1;
    }

    public xp3 u(String str) {
        je9 je9Var = je9.c;
        je9 je9Var2 = je9.f;
        String str2 = ((vo5) this.a).e;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str2, "retrieveInetAddresses -> host=".concat(str), null);
        }
        v44 v44VarA = ((vo5) this.a).c.a();
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            xp3 xp3Var = new xp3(allByName, ew5.g(v44VarA.j()));
            String str3 = ((vo5) this.a).e;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str3, "<- retrieveInetAddresses, ".concat(kotlin.collections.a.h1(allByName, "\n", str.concat("=(\n"), ")", ba.d, 24)), null);
                return xp3Var;
            }
            return xp3Var;
        } catch (UnknownHostException e) {
            String str4 = ((vo5) this.a).e;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                a4cVar3.c(je9Var2, str4, "retrieveInetAddresses, could not get all ip addresses for ".concat(str), e);
            }
            return null;
        } catch (IOException e2) {
            String str5 = ((vo5) this.a).e;
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
                a4cVar4.c(je9Var2, str5, "retrieveInetAddresses, could not get all ip addresses for ".concat(str), e2);
            }
            return null;
        } catch (RuntimeException e3) {
            String str6 = ((vo5) this.a).e;
            a4c a4cVar5 = gm0.f;
            if (a4cVar5 != null && a4cVar5.b(je9Var2)) {
                a4cVar5.c(je9Var2, str6, c0a.o("retrieveInetAddresses, could not get all ip addresses for ", str, " due to unexpected failure"), e3);
            }
            return null;
        }
    }

    public w4(Spannable spannable) {
        Object[] spans;
        h56[] h56VarArr;
        int length;
        int i = 0;
        try {
            spans = spannable.getSpans(0, spannable.length(), h56.class);
            while (true) {
                feg[] fegVarArr = (feg[]) this.a;
                if (i < length) {
                    fegVarArr[i] = new feg(spannable.getSpanStart(h56VarArr[i]), spannable.getSpanEnd(h56VarArr[i]));
                    i++;
                } else {
                    Arrays.sort(fegVarArr);
                    return;
                }
            }
        } catch (Throwable unused) {
            spans = null;
        }
        h56VarArr = (h56[]) (spans == null ? new h56[0] : spans);
        this.a = new feg[h56VarArr.length];
        length = h56VarArr.length;
    }

    public w4(cy5 cy5Var) {
        this.a = new v56(7, cy5Var);
    }

    public w4(nj9 nj9Var, iri iriVar) {
        this.a = iriVar;
    }

    public /* synthetic */ w4(Object obj) {
        this.a = obj;
    }
}
