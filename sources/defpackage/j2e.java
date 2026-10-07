package defpackage;

import android.content.Context;
import android.widget.Chronometer;
import android.widget.LinearLayout;
import java.io.File;
import java.util.concurrent.Executor;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class j2e extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ k2e g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2e(lq4 lq4Var, k2e k2eVar, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = k2eVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        k2e k2eVar = this.g;
        switch (i) {
            case 0:
                j2e j2eVar = new j2e(lq4Var, k2eVar, 0);
                j2eVar.f = obj;
                return j2eVar;
            case 1:
                j2e j2eVar2 = new j2e(lq4Var, k2eVar, 1);
                j2eVar2.f = obj;
                return j2eVar2;
            default:
                j2e j2eVar3 = new j2e(lq4Var, k2eVar, 2);
                j2eVar3.f = obj;
                return j2eVar3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((j2e) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((j2e) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((j2e) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        boolean z = false;
        sbi sbiVar = sbi.a;
        k2e k2eVar = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                v1e v1eVar = (v1e) obj2;
                float f = k2e.t;
                if (v1eVar instanceof u1e) {
                    oc2 cameraApi = k2eVar.getCameraApi();
                    uvc uvcVar = k2eVar.e;
                    ((hj2) cameraApi).f(uvcVar == null ? null : uvcVar, new ew5(((u1e) v1eVar).a));
                } else if (v1eVar instanceof s1e) {
                    oc2 cameraApi2 = k2eVar.getCameraApi();
                    File file = ((s1e) v1eVar).a;
                    hj2 hj2Var = (hj2) cameraApi2;
                    hj2Var.getClass();
                    gm0.n(hj2.class.getName(), "startRecordVideo");
                    if (np4.c(hj2Var.getContext(), "android.permission.RECORD_AUDIO") != 0) {
                        gm0.Y(hj2.class.getName(), "No permission to record audio");
                    } else {
                        p09 p09Var = hj2Var.c;
                        xr6 xr6VarK = new rj5(file).K();
                        Executor executor = hj2Var.a;
                        mx1 mx1Var = new mx1(1, hj2Var);
                        p09Var.getClass();
                        wxl.a();
                        qyj.l("Camera not initialized.", p09Var.r != null);
                        wxl.a();
                        qyj.l("VideoCapture disabled.", (p09Var.b & 4) != 0);
                        wxl.a();
                        fee feeVar = p09Var.k;
                        if (feeVar != null && !feeVar.a.get()) {
                            z = true;
                        }
                        qyj.l("Recording video. Only one recording can be active at a time.", !z);
                        Context context = p09Var.H;
                        fe2 fe2Var = new fe2(p09Var, np4.o(context), mx1Var);
                        o02 o02Var = new o02(context, (dee) p09Var.j.Q(), xr6VarK);
                        if (np4.d(context, "android.permission.RECORD_AUDIO") == -1) {
                            throw new SecurityException("Attempted to start recording with audio, but application does not have RECORD_AUDIO permission granted.");
                        }
                        o02.t(o02Var);
                        fee feeVarP = o02Var.p(executor, fe2Var);
                        p09Var.l.put(fe2Var, feeVarP);
                        p09Var.k = feeVarP;
                        hj2Var.g = feeVarP;
                    }
                } else {
                    if (!(v1eVar instanceof t1e)) {
                        ore.o();
                        return null;
                    }
                    hj2 hj2Var2 = (hj2) k2eVar.getCameraApi();
                    hj2Var2.getClass();
                    gm0.n(hj2.class.getName(), "stopRecordVideo");
                    fee feeVar2 = hj2Var2.g;
                    if (feeVar2 != null) {
                        feeVar2.close();
                    }
                    hj2Var2.g = null;
                }
                return sbiVar;
            case 1:
                ch3.d0(obj);
                k2e.b(k2eVar, (l2e) obj2);
                return sbiVar;
            default:
                ch3.d0(obj);
                b2e b2eVar = (b2e) obj2;
                Chronometer chronometer = k2eVar.j;
                float f2 = k2e.t;
                nd2 nd2Var = k2eVar.m;
                LinearLayout linearLayout = k2eVar.k;
                m5c m5cVar = k2eVar.l;
                m5c m5cVar2 = k2eVar.i;
                m5c m5cVar3 = k2eVar.n;
                m5c m5cVar4 = k2eVar.o;
                if (!cqk.d(b2eVar, x1e.a)) {
                    if (cqk.d(b2eVar, y1e.a)) {
                        m5cVar3.setVisibility(0);
                        m5cVar4.setVisibility(0);
                        m5cVar2.setVisibility(0);
                        m5cVar.setVisibility(0);
                        linearLayout.setVisibility(8);
                        nd2Var.setType(md2.b);
                        m5cVar4.a(f2, R.drawable.icon_video_call, "M8.499 20.253c-0.288 0-0.584-0.007-0.88-0.021L7.373 20.22c-2.078-0.095-3.619-0.166-4.89-1.44-0.664-0.665-1-1.415-1.182-2.304-0.168-0.82-0.212-1.815-0.264-2.988l-0.003-0.074C1.013 12.933 1 12.455 1 12.003c0-0.452 0.013-0.93 0.034-1.411l0.003-0.074C1.09 9.345 1.133 8.351 1.301 7.53c0.181-0.89 0.518-1.639 1.182-2.304 1.271-1.274 2.812-1.345 4.89-1.44l0.246-0.011C7.915 3.761 8.211 3.753 8.5 3.753c0.288 0 0.583 0.008 0.88 0.022l0.246 0.011c2.078 0.095 3.619 0.166 4.89 1.44 0.664 0.665 1 1.415 1.182 2.304 0.168 0.82 0.211 1.815 0.263 2.988l0.004 0.074c0.02 0.482 0.034 0.96 0.034 1.411 0 0.452-0.013 0.93-0.034 1.412L15.96 13.49c-0.052 1.173-0.096 2.167-0.263 2.988-0.181 0.89-0.518 1.639-1.182 2.304-1.271 1.274-2.813 1.345-4.89 1.44L9.38 20.23c-0.297 0.015-0.592 0.022-0.88 0.022z M17.351 15.43c0.05-0.582 0.078-1.191 0.105-1.804l0.006-0.145c0.022-0.498 0.036-0.998 0.036-1.478 0-0.479-0.014-0.98-0.036-1.478l-0.006-0.144c-0.027-0.615-0.054-1.227-0.105-1.81l3.381-2.248 0.018-0.012c0.066-0.044 0.194-0.13 0.32-0.189 0.162-0.075 0.542-0.212 0.971-0.014 0.426 0.196 0.571 0.569 0.62 0.743 0.039 0.135 0.057 0.288 0.067 0.366l0.002 0.02C22.828 8.038 23 9.752 23 12c0 2.25-0.172 3.964-0.27 4.762l-0.002 0.02c-0.01 0.079-0.028 0.232-0.066 0.367-0.05 0.174-0.195 0.547-0.62 0.743-0.43 0.197-0.81 0.06-0.971-0.014-0.127-0.06-0.255-0.145-0.322-0.19l-0.017-0.01-3.38-2.249z");
                        ((hj2) k2eVar.getCameraApi()).c();
                    } else if (cqk.d(b2eVar, a2e.a)) {
                        m5cVar3.setVisibility(0);
                        m5cVar4.setVisibility(0);
                        m5cVar2.setVisibility(0);
                        m5cVar.setVisibility(0);
                        nd2Var.setType(md2.c);
                        linearLayout.setVisibility(8);
                        m5cVar4.a(f2, R.drawable.icon_camera, "M12 8.75c-2.347 0-4.25 1.903-4.25 4.25s1.903 4.25 4.25 4.25 4.25-1.903 4.25-4.25S14.347 8.75 12 8.75zM9.75 13c0-1.243 1.007-2.25 2.25-2.25s2.25 1.007 2.25 2.25-1.007 2.25-2.25 2.25S9.75 14.243 9.75 13z M12 2c-0.872 0-1.886 0.077-2.728 0.364C8.897 2.492 8.556 2.68 8.165 2.961c-0.854 0.612-1.343 1.493-1.8 2.407C5.246 5.535 4.31 5.84 3.517 6.64c-0.621 0.625-0.944 1.33-1.13 2.164-0.209 0.939-0.25 1.913-0.317 2.87C2.027 12.294 2 12.917 2 13.5s0.027 1.206 0.07 1.826c0.067 0.957 0.108 1.931 0.318 2.87 0.185 0.834 0.508 1.54 1.129 2.165 0.625 0.63 1.34 0.956 2.185 1.148 0.962 0.219 1.961 0.269 2.942 0.345C9.751 21.939 10.92 22 12 22s2.249-0.061 3.356-0.146c0.98-0.076 1.98-0.126 2.942-0.345 0.845-0.192 1.56-0.518 2.185-1.148 0.621-0.626 0.944-1.331 1.13-2.165 0.209-0.939 0.25-1.913 0.317-2.87 0.043-0.62 0.07-1.243 0.07-1.826s-0.027-1.206-0.07-1.826c-0.067-0.957-0.108-1.931-0.318-2.87-0.185-0.834-0.508-1.54-1.129-2.165-0.794-0.8-1.73-1.104-2.848-1.27-0.457-0.915-0.946-1.796-1.8-2.408-0.39-0.28-0.732-0.469-1.107-0.597C13.886 2.077 12.872 2 12 2zm-1.38 2.112C11.035 4.046 11.501 4 12 4c0.499 0 0.965 0.046 1.38 0.112 0.492 0.08 0.879 0.18 1.29 0.474 0.467 0.335 0.58 0.537 0.977 1.289 0.233 0.442 0.443 0.895 0.654 1.347l0.559 0.063c1.268 0.141 1.787 0.343 2.204 0.763 0.296 0.298 0.472 0.634 0.596 1.19 0.135 0.605 0.192 1.387 0.274 2.575C19.975 12.402 20 12.976 20 13.5s-0.025 1.098-0.066 1.687c-0.082 1.188-0.139 1.97-0.274 2.574-0.124 0.557-0.3 0.893-0.596 1.191-0.292 0.294-0.632 0.476-1.209 0.607-0.623 0.141-1.432 0.206-2.653 0.3C14.124 19.942 13.012 20 12 20c-1.011 0-2.124-0.058-3.202-0.14-1.221-0.095-2.03-0.16-2.653-0.301-0.577-0.131-0.917-0.313-1.209-0.607-0.296-0.298-0.472-0.634-0.596-1.19-0.135-0.605-0.192-1.387-0.274-2.575C4.025 14.598 4 14.024 4 13.5s0.025-1.098 0.066-1.687c0.082-1.188 0.139-1.97 0.274-2.574 0.124-0.557 0.3-0.893 0.596-1.191 0.417-0.42 0.936-0.622 2.204-0.763L7.7 7.222C7.91 6.77 8.12 6.317 8.354 5.875c0.396-0.752 0.51-0.954 0.978-1.29 0.41-0.294 0.796-0.394 1.29-0.473z");
                        hj2 hj2Var3 = (hj2) k2eVar.getCameraApi();
                        hj2Var3.getClass();
                        try {
                            hj2Var3.c.o(4);
                        } catch (IllegalStateException e) {
                            hj2Var3.b(new fj2(e));
                        }
                    } else {
                        if (!(b2eVar instanceof z1e)) {
                            ore.o();
                            return null;
                        }
                        m5cVar3.setVisibility(8);
                        m5cVar4.setVisibility(8);
                        m5cVar2.setVisibility(8);
                        m5cVar.setVisibility(8);
                        nd2Var.setType(md2.d);
                        linearLayout.setVisibility(0);
                        chronometer.setBase(((z1e) b2eVar).a);
                        chronometer.start();
                    }
                    break;
                } else {
                    m5cVar3.setVisibility(0);
                    m5cVar4.setVisibility(0);
                    m5cVar2.setVisibility(0);
                    m5cVar.setVisibility(0);
                    linearLayout.setVisibility(8);
                    nd2Var.setType(md2.a);
                    m5cVar4.a(f2, R.drawable.icon_video_call, "M8.499 20.253c-0.288 0-0.584-0.007-0.88-0.021L7.373 20.22c-2.078-0.095-3.619-0.166-4.89-1.44-0.664-0.665-1-1.415-1.182-2.304-0.168-0.82-0.212-1.815-0.264-2.988l-0.003-0.074C1.013 12.933 1 12.455 1 12.003c0-0.452 0.013-0.93 0.034-1.411l0.003-0.074C1.09 9.345 1.133 8.351 1.301 7.53c0.181-0.89 0.518-1.639 1.182-2.304 1.271-1.274 2.812-1.345 4.89-1.44l0.246-0.011C7.915 3.761 8.211 3.753 8.5 3.753c0.288 0 0.583 0.008 0.88 0.022l0.246 0.011c2.078 0.095 3.619 0.166 4.89 1.44 0.664 0.665 1 1.415 1.182 2.304 0.168 0.82 0.211 1.815 0.263 2.988l0.004 0.074c0.02 0.482 0.034 0.96 0.034 1.411 0 0.452-0.013 0.93-0.034 1.412L15.96 13.49c-0.052 1.173-0.096 2.167-0.263 2.988-0.181 0.89-0.518 1.639-1.182 2.304-1.271 1.274-2.813 1.345-4.89 1.44L9.38 20.23c-0.297 0.015-0.592 0.022-0.88 0.022z M17.351 15.43c0.05-0.582 0.078-1.191 0.105-1.804l0.006-0.145c0.022-0.498 0.036-0.998 0.036-1.478 0-0.479-0.014-0.98-0.036-1.478l-0.006-0.144c-0.027-0.615-0.054-1.227-0.105-1.81l3.381-2.248 0.018-0.012c0.066-0.044 0.194-0.13 0.32-0.189 0.162-0.075 0.542-0.212 0.971-0.014 0.426 0.196 0.571 0.569 0.62 0.743 0.039 0.135 0.057 0.288 0.067 0.366l0.002 0.02C22.828 8.038 23 9.752 23 12c0 2.25-0.172 3.964-0.27 4.762l-0.002 0.02c-0.01 0.079-0.028 0.232-0.066 0.367-0.05 0.174-0.195 0.547-0.62 0.743-0.43 0.197-0.81 0.06-0.971-0.014-0.127-0.06-0.255-0.145-0.322-0.19l-0.017-0.01-3.38-2.249z");
                    ((hj2) k2eVar.getCameraApi()).c();
                }
                return sbiVar;
        }
    }
}
