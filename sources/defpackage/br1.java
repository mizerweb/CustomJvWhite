package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import java.util.function.ToLongFunction;
import one.me.calllist.ui.callpresettings.CallPresettingsScreen;
import one.me.calls.impl.service.CallServiceImpl;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.calls.ui.ui.call.CallScreen;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class br1 implements af7 {
    public final /* synthetic */ int a;

    public /* synthetic */ br1(ev1 ev1Var) {
        this.a = 11;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        t3g t3gVar = t3g.a;
        switch (i) {
            case 0:
                return new ShapeDrawable(new RoundRectShape(new float[]{yl5.d().getDisplayMetrics().density * 12.0f, yl5.d().getDisplayMetrics().density * 12.0f, yl5.d().getDisplayMetrics().density * 12.0f, yl5.d().getDisplayMetrics().density * 12.0f, yl5.d().getDisplayMetrics().density * 12.0f, yl5.d().getDisplayMetrics().density * 12.0f, yl5.d().getDisplayMetrics().density * 12.0f, yl5.d().getDisplayMetrics().density * 12.0f}, null, null));
            case 1:
                return new ou3();
            case 2:
                wpc wpcVar = new wpc();
                wpcVar.b = 960;
                return wpcVar;
            case 3:
                zv8[] zv8VarArr = CallMoreBottomSheet.t;
                return new ade();
            case 4:
                zv8[] zv8VarArr2 = CallMoreBottomSheet.t;
                return new ee1();
            case 5:
                int i2 = dt1.w;
                return sbiVar;
            case 6:
                int i3 = 12;
                lv5 lv5Var = new lv5(i3);
                final xk1 xk1Var = new xk1(i3);
                return lv5Var.thenComparingLong(new ToLongFunction() { // from class: ft1
                    @Override // java.util.function.ToLongFunction
                    public final long applyAsLong(Object obj) {
                        return ((Number) xk1Var.invoke(obj)).longValue();
                    }
                }).thenComparing(new lv5(13)).reversed();
            case 7:
                zv8[] zv8VarArr3 = CallOpponentsListWidget.v;
                return y3f.ADMIN_CALL_SETTINGS;
            case 8:
                zv8[] zv8VarArr4 = CallOpponentsListWidget.v;
                float f = yl5.d().getDisplayMetrics().density * 12.0f;
                return new float[]{f, f, f, f, f, f, f, f};
            case 9:
                zv8[] zv8VarArr5 = CallOpponentsListWidget.v;
                return t3gVar;
            case 10:
                zv8[] zv8VarArr6 = ev1.k;
                return 262952;
            case 11:
                return null;
            case 12:
                zv8[] zv8VarArr7 = CallPresettingsScreen.i;
                return new jv1();
            case 13:
                int i4 = vv1.z;
                return sbiVar;
            case 14:
                l6m l6mVar = CallScreen.D1;
                return new p22();
            case 15:
                l6m l6mVar2 = CallScreen.D1;
                return new c1d();
            case 16:
                l6m l6mVar3 = CallScreen.D1;
                return new a9j();
            case 17:
                l6m l6mVar4 = CallScreen.D1;
                return new czf();
            case 18:
                l6m l6mVar5 = CallScreen.D1;
                return t3gVar;
            case 19:
                l6m l6mVar6 = CallScreen.D1;
                return y3f.CALL;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new p22();
            case 21:
                return new s32();
            case 22:
                int i5 = CallServiceImpl.i;
                return new ga2(2).b();
            case 23:
                int i6 = CallServiceImpl.i;
                return (c95) new ga2(2).getAccessor().c(734);
            case 24:
                int i7 = CallServiceImpl.i;
                return cqk.a(((y82) new ga2(2).getAccessor().c(65)).k().u0(wk8.a()));
            case 25:
                float f2 = yl5.d().getDisplayMetrics().density * 40.0f;
                return new float[]{f2, f2, f2, f2, f2, f2, f2, f2};
            case 26:
                return new f1d();
            case 27:
                int i8 = a42.K;
                return -231920335;
            case 28:
                float f3 = yl5.d().getDisplayMetrics().density * 20.0f;
                return new float[]{f3, f3, f3, f3, f3, f3, f3, f3};
            default:
                return new b82();
        }
    }

    public /* synthetic */ br1(int i) {
        this.a = i;
    }
}
