package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.function.UnaryOperator;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ea1 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ea1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                pw pwVar = (pw) obj;
                pwVar.remove(Long.valueOf(((fu1) obj2).a));
                return pwVar;
            case 1:
                ac1 ac1Var = (ac1) obj2;
                rb0 rb0Var = (rb0) obj;
                if (rb0Var != null) {
                    return rb0Var;
                }
                ny8 ny8Var = ac1Var.e;
                ny8 ny8Var2 = ac1Var.c;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 31) {
                    ny8 ny8Var3 = ac1Var.b;
                    if (i2 >= 34) {
                        return new td4((ue1) ny8Var3.getValue(), (ExecutorService) ac1Var.d.getValue(), (rd1) ny8Var2.getValue(), (b95) ny8Var.getValue());
                    }
                    ee4 ee4Var = new ee4((ue1) ny8Var3.getValue(), (rd1) ny8Var2.getValue(), (b95) ny8Var.getValue());
                    ee4Var.g = a80.d;
                    return ee4Var;
                }
                d82 d82Var = (d82) ac1Var.a.getValue();
                d82Var.getClass();
                CallsAudioManager.Builder disabledAudioDeviceUsagePolicy = new CallsAudioManager.Builder().setContext((Context) d82Var.a.getValue()).setProximityTracker(d82Var.c).setVideoTracker(new ot4(19, new jc1(0, 2, rd1.class, d82Var.b.getValue(), "isVideoEnabled", "isVideoEnabled()Z"))).setAwaitDeviceChangeConfirmationEnabled(((Boolean) ((e5d) d82Var.f.getValue()).T0.a(e5d.S6[96]).i()).booleanValue()).setDisabledAudioDeviceUsagePolicy(new c82());
                ((wxb) d82Var.d.getValue()).getClass();
                if (((Number) ((g5d) ((gjf) d82Var.e.getValue())).a.d().i()).intValue() == 3) {
                    disabledAudioDeviceUsagePolicy.setLogger((b82) d82Var.g.getValue());
                }
                return new v6f(disabledAudioDeviceUsagePolicy.build());
            case 2:
                Iterable iterable = ((ww2) obj2).e;
                if (iterable == null) {
                    iterable = r66.a;
                }
                return ww3.T1(iterable);
            case 3:
                return ((qy9) obj2).B();
            case 4:
                return (v13) obj2;
            case 5:
                return (wz9) obj2;
            case 6:
                return ((ke8) ((me8) obj2)).b;
            case 7:
                LinkedHashSet linkedHashSet = new LinkedHashSet((Set) obj);
                linkedHashSet.add((xyc) obj2);
                return linkedHashSet;
            case 8:
                r3h r3hVar = (r3h) obj;
                return ((r3hVar instanceof o3h) && cqk.d(((o3h) r3hVar).a(), ((pxa) obj2).b)) ? p3h.a : r3hVar;
            case 9:
                ((agb) obj).h(false);
                return ((mih) obj2).f();
            default:
                dd0 dd0Var = (dd0) obj2;
                if (dd0Var != null) {
                    return dd0Var.c;
                }
                return null;
        }
    }
}
