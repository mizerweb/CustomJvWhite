package defpackage;

import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jc1 extends y8b {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc1(et3 et3Var, int i) {
        super(et3Var, et3.class, "isCallsDebugMenuEnabled", "isCallsDebugMenuEnabled()Z", 0);
        this.b = i;
        switch (i) {
            case 1:
                super(et3Var, et3.class, "isCallHoldButtonEnabled", "isCallHoldButtonEnabled()Z", 0);
                break;
            case 2:
            case 3:
            case 7:
            default:
                break;
            case 4:
                super(et3Var, et3.class, "isDisableInAppReviewTimeCondition", "isDisableInAppReviewTimeCondition()Z", 0);
                break;
            case 5:
                super(et3Var, et3.class, "isEnableInAppReviewNotFromMarketBuild", "isEnableInAppReviewNotFromMarketBuild()Z", 0);
                break;
            case 6:
                super(et3Var, et3.class, "isDisableWebAppSsl", "isDisableWebAppSsl()Z", 0);
                break;
            case 8:
                super(et3Var, et3.class, "isVideoDebugViewAvailable", "isVideoDebugViewAvailable()Z", 0);
                break;
            case 9:
                super(et3Var, et3.class, "isDebugProfileInfoEnabled", "isDebugProfileInfoEnabled()Z", 0);
                break;
            case 10:
                super(et3Var, et3.class, "isWebAppFullscreen", "isWebAppFullscreen()Z", 0);
                break;
        }
    }

    @Override // defpackage.y8b, defpackage.xv8
    public final Object get() {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((xb9) ((et3) this.receiver)).b0());
            case 1:
                xb9 xb9Var = (xb9) ((et3) this.receiver);
                Boolean bool = (Boolean) xb9Var.H0.m(xb9Var, xb9.g1[24]);
                bool.booleanValue();
                return bool;
            case 2:
                return Boolean.valueOf(((rd1) this.receiver).c());
            case 3:
                return ((f9b) this.receiver).getValue();
            case 4:
                return Boolean.valueOf(((xb9) ((et3) this.receiver)).d0());
            case 5:
                xb9 xb9Var2 = (xb9) ((et3) this.receiver);
                Boolean bool2 = (Boolean) xb9Var2.y0.m(xb9Var2, xb9.g1[15]);
                bool2.booleanValue();
                return bool2;
            case 6:
                return Boolean.valueOf(((xb9) ((et3) this.receiver)).e0());
            case 7:
                aue aueVar = (aue) ((zte) this.receiver);
                Boolean bool3 = (Boolean) aueVar.f.m(aueVar, aue.h[1]);
                bool3.booleanValue();
                return bool3;
            case 8:
                return Boolean.valueOf(((xb9) ((et3) this.receiver)).g0());
            case 9:
                xb9 xb9Var3 = (xb9) ((et3) this.receiver);
                Boolean bool4 = (Boolean) xb9Var3.z0.m(xb9Var3, xb9.g1[16]);
                bool4.booleanValue();
                return bool4;
            case 10:
                xb9 xb9Var4 = (xb9) ((et3) this.receiver);
                Boolean bool5 = (Boolean) xb9Var4.D0.m(xb9Var4, xb9.g1[20]);
                bool5.booleanValue();
                return bool5;
            case 11:
                return ((n8b) this.receiver).a;
            case 12:
                return ((n8b) this.receiver).c;
            case 13:
                return ((n8b) this.receiver).b;
            case 14:
                return ((n8b) this.receiver).a;
            case 15:
                return ((n8b) this.receiver).b;
            case 16:
                return ((n8b) this.receiver).c;
            case 17:
                return ((n8b) this.receiver).d;
            case 18:
                return ((n8b) this.receiver).a;
            case 19:
                return ((n8b) this.receiver).b;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((n8b) this.receiver).c;
            case 21:
                return ((n8b) this.receiver).d;
            case 22:
                return ((n8b) this.receiver).d;
            default:
                return ((ru1) this.receiver).k;
        }
    }

    @Override // defpackage.y8b
    public final void k(Object obj) {
        switch (this.b) {
            case 0:
                xb9 xb9Var = (xb9) ((et3) this.receiver);
                xb9Var.G0.B(xb9Var, xb9.g1[23], (Boolean) obj);
                break;
            case 1:
                xb9 xb9Var2 = (xb9) ((et3) this.receiver);
                xb9Var2.H0.B(xb9Var2, xb9.g1[24], (Boolean) obj);
                break;
            case 2:
                ((rd1) this.receiver).d(((Boolean) obj).booleanValue());
                break;
            case 3:
                ((f9b) this.receiver).setValue(obj);
                break;
            case 4:
                xb9 xb9Var3 = (xb9) ((et3) this.receiver);
                xb9Var3.x0.B(xb9Var3, xb9.g1[14], (Boolean) obj);
                break;
            case 5:
                xb9 xb9Var4 = (xb9) ((et3) this.receiver);
                xb9Var4.y0.B(xb9Var4, xb9.g1[15], (Boolean) obj);
                break;
            case 6:
                xb9 xb9Var5 = (xb9) ((et3) this.receiver);
                xb9Var5.w0.B(xb9Var5, xb9.g1[13], (Boolean) obj);
                break;
            case 7:
                aue aueVar = (aue) ((zte) this.receiver);
                aueVar.f.B(aueVar, aue.h[1], (Boolean) obj);
                break;
            case 8:
                xb9 xb9Var6 = (xb9) ((et3) this.receiver);
                xb9Var6.R0.B(xb9Var6, xb9.g1[35], (Boolean) obj);
                break;
            case 9:
                xb9 xb9Var7 = (xb9) ((et3) this.receiver);
                xb9Var7.z0.B(xb9Var7, xb9.g1[16], (Boolean) obj);
                break;
            case 10:
                xb9 xb9Var8 = (xb9) ((et3) this.receiver);
                xb9Var8.D0.B(xb9Var8, xb9.g1[20], (Boolean) obj);
                break;
            case 11:
                n8b n8bVar = (n8b) this.receiver;
                n8bVar.getClass();
                n8bVar.a = (o0a) obj;
                break;
            case 12:
                n8b n8bVar2 = (n8b) this.receiver;
                n8bVar2.getClass();
                n8bVar2.c = (o0a) obj;
                break;
            case 13:
                n8b n8bVar3 = (n8b) this.receiver;
                n8bVar3.getClass();
                n8bVar3.b = (o0a) obj;
                break;
            case 14:
                n8b n8bVar4 = (n8b) this.receiver;
                n8bVar4.getClass();
                n8bVar4.a = (o0a) obj;
                break;
            case 15:
                n8b n8bVar5 = (n8b) this.receiver;
                n8bVar5.getClass();
                n8bVar5.b = (o0a) obj;
                break;
            case 16:
                n8b n8bVar6 = (n8b) this.receiver;
                n8bVar6.getClass();
                n8bVar6.c = (o0a) obj;
                break;
            case 17:
                n8b n8bVar7 = (n8b) this.receiver;
                n8bVar7.getClass();
                n8bVar7.d = (o0a) obj;
                break;
            case 18:
                n8b n8bVar8 = (n8b) this.receiver;
                n8bVar8.getClass();
                n8bVar8.a = (o0a) obj;
                break;
            case 19:
                n8b n8bVar9 = (n8b) this.receiver;
                n8bVar9.getClass();
                n8bVar9.b = (o0a) obj;
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                n8b n8bVar10 = (n8b) this.receiver;
                n8bVar10.getClass();
                n8bVar10.c = (o0a) obj;
                break;
            case 21:
                n8b n8bVar11 = (n8b) this.receiver;
                n8bVar11.getClass();
                n8bVar11.d = (o0a) obj;
                break;
            case 22:
                n8b n8bVar12 = (n8b) this.receiver;
                n8bVar12.getClass();
                n8bVar12.d = (o0a) obj;
                break;
            default:
                ((ru1) this.receiver).p((dnf) obj);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc1(m3 m3Var) {
        super(m3Var, f9b.class, SdkMetricStatEvent.VALUE_KEY, "getValue()Ljava/lang/Object;", 0);
        this.b = 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jc1(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.b = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc1(zte zteVar) {
        super(zteVar, zte.class, "isDisableIncomingCalls", "isDisableIncomingCalls()Z", 0);
        this.b = 7;
    }
}
