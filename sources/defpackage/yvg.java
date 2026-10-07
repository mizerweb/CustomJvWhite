package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.SystemClock;
import android.view.VelocityTracker;
import android.view.animation.PathInterpolator;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import one.me.calls.impl.service.telecom.TelecomCallService;
import one.me.stories.viewer.viewer.widgets.writebar.StoriesWriteBarWidget;
import one.me.transparent.TransparentActivity;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yvg implements af7 {
    public final /* synthetic */ int a;

    public /* synthetic */ yvg(zfh zfhVar) {
        this.a = 12;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = StoriesWriteBarWidget.n;
                return null;
            case 1:
                zv8[] zv8VarArr2 = StoriesWriteBarWidget.n;
                return new hn9();
            case 2:
                zv8[] zv8VarArr3 = StoriesWriteBarWidget.n;
                return new qbe(new yvg(0), p90.a(null));
            case 3:
                zv8[] zv8VarArr4 = StoriesWriteBarWidget.n;
                return new m5b();
            case 4:
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                return paint;
            case 5:
                return Long.valueOf(SystemClock.elapsedRealtime());
            case 6:
                ul9 ul9Var = new ul9();
                if (Build.VERSION.SDK_INT >= 28) {
                    Class clsY = b88.y();
                    chf chfVar = new chf(26);
                    nag nagVar = new nag();
                    chfVar.invoke(nagVar);
                    ul9Var.put(clsY, new g5h(nagVar.a));
                    Class clsC = b88.C();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Collections.singletonList("com.google.android.gms"));
                    ul9Var.put(clsC, new g5h(arrayList));
                }
                return ul9Var.b();
            case 7:
                ul9 ul9Var2 = new ul9();
                if (Build.VERSION.SDK_INT >= 28) {
                    Class clsM = b88.m();
                    nag nagVar2 = new nag();
                    nagVar2.b(zfe.a(agb.class).d().getCanonicalName());
                    nagVar2.a(zfe.a(fsb.class));
                    nagVar2.b("ru.ok.android");
                    nagVar2.b("org.webrtc");
                    nagVar2.b(zfe.a(nz0.class).d().getCanonicalName());
                    ul9Var2.put(clsM, new g5h(nagVar2.a));
                }
                return ul9Var2.b();
            case 8:
                return n8h.Companion.serializer();
            case 9:
                return ewl.a("one.me.webapp.domain.jsbridge.SuccessResponse.Status", n8h.values(), new String[]{"updated", "removed", "cleared", "opened", "authorized"}, new Annotation[][]{null, null, null, null, null});
            case 10:
                return VelocityTracker.obtain();
            case 11:
                int i2 = reh.e;
                return sbiVar;
            case 12:
                String str = "";
                try {
                    Class<?> cls = Class.forName("android.os.SystemProperties");
                    str = (String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.build.backported_fixes.alias_bitset.long_list", "");
                } catch (Exception unused) {
                }
                c79 c79VarW = yab.w();
                Iterator it = r5h.l1(str, new char[]{','}).iterator();
                while (it.hasNext()) {
                    try {
                        c79VarW.add(Long.valueOf(Long.parseLong((String) it.next())));
                    } catch (NumberFormatException unused2) {
                    }
                }
                BitSet bitSetValueOf = BitSet.valueOf(ww3.U1(yab.j(c79VarW)));
                int size = bitSetValueOf.size();
                if (size == 0) {
                    return c76.a;
                }
                gof gofVar = new gof(new ul9(size));
                for (int iNextSetBit = 0; iNextSetBit >= 0; iNextSetBit = bitSetValueOf.nextSetBit(iNextSetBit + 1)) {
                    if (bitSetValueOf.get(iNextSetBit)) {
                        gofVar.add(Integer.valueOf(iNextSetBit));
                    }
                    if (iNextSetBit == Integer.MAX_VALUE) {
                        return p90.e(gofVar);
                    }
                }
                return p90.e(gofVar);
            case 13:
                int i3 = TelecomCallService.e;
                return new ga2(2);
            case 14:
                return new ga2(2).b();
            case 15:
                return xrh.a("#ff242f3e").toByteArray();
            case 16:
                return xrh.a("#fff5f5f5").toByteArray();
            case 17:
                return "Failed to start transcoder";
            case 18:
                return "Transcode error";
            case 19:
                return "Failed to start the transcoder";
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return "Unexpected exception on getting a file from the Uri";
            case 21:
                return "Failed to close raf";
            case 22:
                return new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
            case 23:
                int i4 = TransparentActivity.z;
                r7 r7Var = r7.a;
                return new wtc(r7.d(ha9.b)).h();
            case 24:
                int i5 = uw8.a;
                return Boolean.valueOf(uw8.b(uw8.c));
            case 25:
                zv8[] zv8VarArr5 = edi.j;
                return sbiVar;
            case 26:
                return new jj4(bi4.l, bi4.n);
            case 27:
                return "file read error";
            case 28:
                return "Upload chunk: completed";
            default:
                return "all chunks were acquired";
        }
    }

    public /* synthetic */ yvg(int i) {
        this.a = i;
    }
}
