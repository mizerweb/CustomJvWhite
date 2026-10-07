package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import one.me.webapp.util.WebAppDelegateFreezeException;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u8h implements cf7 {
    public final /* synthetic */ int a;

    public /* synthetic */ u8h(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        sbi sbiVar = sbi.a;
        boolean z = true;
        switch (i) {
            case 0:
                CharSequence charSequence = ((p8h) obj).e;
                return Boolean.valueOf(((charSequence == null || charSequence.length() == 0) ? 1 : 0) ^ 1);
            case 1:
                return Boolean.valueOf(((ll4) obj).b == kl4.b);
            case 2:
                return ((ll4) obj).a();
            case 3:
                ((o63) obj).a.s.h();
                return true;
            case 4:
                CharSequence charSequence2 = ((p8h) obj).e;
                return Boolean.valueOf(((charSequence2 == null || charSequence2.length() == 0) ? 1 : 0) ^ 1);
            case 5:
                return Integer.valueOf(((kbc) obj).getText().h);
            case 6:
                return Boolean.valueOf(((WeakReference) obj).get() == null);
            case 7:
                vxe vxeVarO0 = ((qxe) obj).O0("SELECT COUNT(*) FROM tasks WHERE type = ? AND status = ?");
                try {
                    vxeVarO0.c(1, 12L);
                    vxeVarO0.c(2, 10L);
                    return Integer.valueOf(vxeVarO0.M0() ? (int) vxeVarO0.getLong(0) : 0);
                } finally {
                    vxeVarO0.close();
                }
            case 8:
                vxe vxeVarO1 = ((qxe) obj).O0("SELECT * FROM tasks WHERE type = ? LIMIT ?");
                try {
                    vxeVarO1.c(1, 48L);
                    vxeVarO1.c(2, 100L);
                    int iE = qyj.E(vxeVarO1, "id");
                    int iE2 = qyj.E(vxeVarO1, "type");
                    int iE3 = qyj.E(vxeVarO1, "status");
                    int iE4 = qyj.E(vxeVarO1, "fails_count");
                    int iE5 = qyj.E(vxeVarO1, "depends_request_id");
                    int iE6 = qyj.E(vxeVarO1, "dependency_type");
                    int iE7 = qyj.E(vxeVarO1, "data");
                    int iE8 = qyj.E(vxeVarO1, "created_time");
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO1.M0()) {
                        int i2 = iE2;
                        int i3 = iE3;
                        arrayList.add(new ujh(vxeVarO1.getLong(iE), xvc.x((int) vxeVarO1.getLong(iE2)), xvc.w((int) vxeVarO1.getLong(iE3)), (int) vxeVarO1.getLong(iE4), vxeVarO1.getLong(iE5), (int) vxeVarO1.getLong(iE6), vxeVarO1.getBlob(iE7), vxeVarO1.getLong(iE8)));
                        iE2 = i2;
                        iE3 = i3;
                    }
                    vxeVarO1.close();
                    return arrayList;
                } catch (Throwable th) {
                    vxeVarO1.close();
                    throw th;
                }
            case 9:
                vxe vxeVarO2 = ((qxe) obj).O0("DELETE FROM tasks");
                try {
                    vxeVarO2.M0();
                    return sbiVar;
                } finally {
                    vxeVarO2.close();
                }
            case 10:
                vxe vxeVarO3 = ((qxe) obj).O0("SELECT type, COUNT(*) as count FROM tasks WHERE status = ? OR status = ? GROUP BY type");
                try {
                    vxeVarO3.c(1, 0L);
                    vxeVarO3.c(2, 20L);
                    ArrayList arrayList2 = new ArrayList();
                    while (vxeVarO3.M0()) {
                        arrayList2.add(new sjh(xvc.x((int) vxeVarO3.getLong(0)), (int) vxeVarO3.getLong(1)));
                    }
                    vxeVarO3.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    vxeVarO3.close();
                    throw th2;
                }
            case 11:
                return Integer.valueOf(((kbc) obj).getText().i);
            case 12:
                return new ej5(ej5.b.incrementAndGet());
            case 13:
                return sbiVar;
            case 14:
                u0i u0iVar = new u0i((Context) obj);
                u0iVar.setVisibility(0);
                return u0iVar;
            case 15:
                dw8 dw8Var = (dw8) obj;
                int i4 = dw8Var.a;
                if (i4 == 0) {
                    return "*";
                }
                bw8 bw8Var = dw8Var.b;
                f9i f9iVar = bw8Var instanceof f9i ? (f9i) bw8Var : null;
                String strD = f9iVar != null ? f9iVar.d(true) : String.valueOf(bw8Var);
                int iD = qt4.D(i4);
                if (iD == 0) {
                    return strD;
                }
                if (iD == 1) {
                    return "in ".concat(strD);
                }
                if (iD == 2) {
                    return "out ".concat(strD);
                }
                ore.o();
                return null;
            case 16:
                return Boolean.valueOf(((vfi) obj).a());
            case 17:
                return (String) obj;
            case 18:
                List listM1 = r5h.m1((String) obj, new String[]{"/"}, 6);
                if (listM1.size() != 2 || r5h.X0((CharSequence) listM1.get(0))) {
                    listM1 = null;
                }
                if (listM1 != null) {
                    return (String) listM1.get(0);
                }
                return null;
            case 19:
                vxe vxeVarO4 = ((qxe) obj).O0("DELETE FROM uploads");
                try {
                    vxeVarO4.M0();
                    return sbiVar;
                } finally {
                    vxeVarO4.close();
                }
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                String str = (String) obj;
                str.getClass();
                return Pattern.quote(str);
            case 21:
                return ((cli) obj).i;
            case 22:
                lyj lyjVar = (lyj) obj;
                return new ylc(Boolean.valueOf(lyjVar.e.a("showSaving", false)), lyjVar.b);
            case 23:
                return ((o63) obj).a.toString();
            case 24:
                vxe vxeVarO5 = ((qxe) obj).O0("DELETE FROM video_conversions");
                try {
                    vxeVarO5.M0();
                    return sbiVar;
                } finally {
                    vxeVarO5.close();
                }
            case 25:
                x5j x5jVar = new x5j((Context) obj);
                x5jVar.setVisibility(8);
                x5jVar.setAlpha(0.0f);
                return x5jVar;
            case 26:
                vxe vxeVarO6 = ((qxe) obj).O0("DELETE FROM video_message_preparations");
                try {
                    vxeVarO6.M0();
                    return sbiVar;
                } finally {
                    vxeVarO6.close();
                }
            case 27:
                StackTraceElement stackTraceElement = (StackTraceElement) obj;
                if (!z5h.K0(stackTraceElement.getClassName(), "java.util.concurrent", false) && !z5h.K0(stackTraceElement.getClassName(), "kotlinx.coroutines", false)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                return Boolean.valueOf(!z5h.K0(((StackTraceElement) obj).getClassName(), ncj.h, false));
            default:
                WebAppDelegateFreezeException webAppDelegateFreezeException = new WebAppDelegateFreezeException("Handle freeze 10 seconds in delegate scope");
                gm0.V(rej.class.getName(), webAppDelegateFreezeException.getMessage(), webAppDelegateFreezeException);
                return sbiVar;
        }
    }

    public /* synthetic */ u8h(int i, Object obj) {
        this.a = i;
    }
}
