package defpackage;

import android.app.Application;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.common.analytics.AnalyticsSenderProvider;
import com.vk.push.common.component.PushTokenComponent;
import com.vk.push.common.component.TopicComponent;
import com.vk.push.common.logger.LoggerProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class efk implements TopicComponent, h4k, PushTokenComponent, AnalyticsSenderProvider, LoggerProvider {
    public static final rek r = new rek();
    public static volatile efk s;
    public final Application a;
    public final Logger b;
    public final ifh c;
    public final ifh d;
    public final ifh e;
    public final ifh f;
    public final ifh g;
    public final ifh h;
    public final ifh i;
    public final ifh j;
    public final ifh k;
    public final ifh l;
    public final ifh m;
    public final ifh n;
    public final ifh o;
    public final ifh p;
    public final dq4 q;

    public efk(gik gikVar) {
        dul dulVar = dul.n;
        if (!cqk.d(dul.o, gikVar)) {
            synchronized (dulVar) {
                if (!cqk.d(dul.o, gikVar)) {
                    dul.o = gikVar;
                }
            }
        }
        this.a = dul.w().a;
        gik gikVar2 = dul.o;
        this.b = gikVar2 != null ? gikVar2.c : new DefaultLogger("VkpnsClientSdk");
        this.c = new ifh(gg5.r);
        this.d = new ifh(gg5.t);
        this.e = new ifh(new sek(this, 3));
        this.f = new ifh(new sek(this, 1));
        this.g = new ifh(gg5.s);
        this.h = new ifh(gg5.x);
        this.i = new ifh(gg5.v);
        this.j = new ifh(new sek(this, 0));
        this.k = new ifh(gg5.u);
        this.l = new ifh(gg5.w);
        this.m = new ifh(gg5.y);
        this.n = new ifh(new sek(this, 5));
        this.o = new ifh(new sek(this, 4));
        this.p = new ifh(new sek(this, 2));
        this.q = cqk.a(ao5.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(efk efkVar, nq4 nq4Var) {
        whk whkVar;
        efk efkVar2;
        AnalyticsSender analyticsSender;
        if (nq4Var instanceof whk) {
            whkVar = (whk) nq4Var;
            int i = whkVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                whkVar.h = i - Integer.MIN_VALUE;
            } else {
                whkVar = new whk(efkVar, nq4Var);
            }
        } else {
            whkVar = new whk(efkVar, nq4Var);
        }
        Object obj = whkVar.f;
        int i2 = whkVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            AnalyticsSender analyticsSender2 = (AnalyticsSender) efkVar.c.getValue();
            y3k y3kVar = (y3k) efkVar.m.getValue();
            whkVar.d = efkVar;
            whkVar.e = analyticsSender2;
            whkVar.h = 1;
            Object objA = y3kVar.a(whkVar);
            hu4 hu4Var = hu4.a;
            if (objA == hu4Var) {
                return hu4Var;
            }
            efkVar2 = efkVar;
            analyticsSender = analyticsSender2;
            obj = objA;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            analyticsSender = whkVar.e;
            efkVar2 = whkVar.d;
            ch3.d0(obj);
        }
        analyticsSender.send(new z3k((String) obj, new umb(efkVar2.a).b.areNotificationsEnabled()));
        return sbi.a;
    }

    @Override // defpackage.h4k
    public final ljh a() {
        return ((h4k) this.p.getValue()).a();
    }

    @Override // com.vk.push.common.component.PushTokenComponent
    public final ljh deleteToken() {
        ljh ljhVar = new ljh();
        fjh fjhVar = new fjh(ljhVar);
        Logger.DefaultImpls.info$default(this.b, "Delete current push token", null, 2, null);
        ao5 ao5Var = ao5.a;
        yab.i0(this.q, lb5.c, 0, new wfk(this, fjhVar, null, 0), 2);
        return ljhVar;
    }

    @Override // com.vk.push.common.component.PushTokenComponent
    public final ljh getToken() {
        ljh ljhVar = new ljh();
        fjh fjhVar = new fjh(ljhVar);
        Logger.DefaultImpls.info$default(this.b, "Get token requested", null, 2, null);
        ao5 ao5Var = ao5.a;
        yab.i0(this.q, lb5.c, 0, new wfk(this, fjhVar, null, 1), 2);
        return ljhVar;
    }

    @Override // com.vk.push.common.analytics.AnalyticsSenderProvider
    public final AnalyticsSender provideAnalyticsSender() {
        return (AnalyticsSender) this.c.getValue();
    }

    @Override // com.vk.push.common.logger.LoggerProvider
    public final Logger provideLogger() {
        gik gikVar = dul.o;
        return gikVar != null ? gikVar.c : new DefaultLogger("VkpnsClientSdk");
    }

    @Override // com.vk.push.common.component.TopicComponent
    public final ljh subscribeToTopic(String str) {
        return ((TopicComponent) this.o.getValue()).subscribeToTopic(str);
    }

    @Override // com.vk.push.common.component.TopicComponent
    public final ljh unsubscribeFromTopic(String str) {
        return ((TopicComponent) this.o.getValue()).unsubscribeFromTopic(str);
    }
}
