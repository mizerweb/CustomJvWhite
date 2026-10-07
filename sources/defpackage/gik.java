package defpackage;

import android.app.Application;
import com.vk.push.common.AppInfo;
import com.vk.push.common.HostInfoProvider;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gik {
    public final Application a;
    public final String b;
    public final ac5 c;
    public final HostInfoProvider d;
    public final HostInfoProvider e;
    public final AppInfo f;
    public final List g;
    public final String h;

    public gik(Application application, String str, ac5 ac5Var, HostInfoProvider hostInfoProvider, HostInfoProvider hostInfoProvider2, AppInfo appInfo, List list, String str2) {
        this.a = application;
        this.b = str;
        this.c = ac5Var;
        this.d = hostInfoProvider;
        this.e = hostInfoProvider2;
        this.f = appInfo;
        this.g = list;
        this.h = str2;
    }

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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gik)) {
            return false;
        }
        gik gikVar = (gik) obj;
        if (!cqk.d(this.a, gikVar.a) || !this.b.equals(gikVar.b) || !this.c.equals(gikVar.c)) {
            return false;
        }
        r66 r66Var = r66.a;
        return r66Var.equals(r66Var) && r66Var.equals(r66Var) && cqk.d(this.d, gikVar.d) && cqk.d(this.e, gikVar.e) && cqk.d(this.f, gikVar.f) && this.g.equals(gikVar.g) && this.h.equals(gikVar.h);
    }

    public final int hashCode() {
        int iHashCode = (((((this.c.hashCode() + zo5.d(this.a.hashCode() * 31, 961, this.b)) * 31) + 1) * 31) + 1) * 31;
        HostInfoProvider hostInfoProvider = this.d;
        int iHashCode2 = (iHashCode + (hostInfoProvider == null ? 0 : hostInfoProvider.hashCode())) * 31;
        HostInfoProvider hostInfoProvider2 = this.e;
        return this.h.hashCode() + qv1.c((this.f.hashCode() + ((iHashCode2 + (hostInfoProvider2 != null ? hostInfoProvider2.hashCode() : 0)) * 31)) * 31, 961, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkpnsConfig(application=");
        sb.append(this.a);
        sb.append(", projectId=");
        sb.append(this.b);
        sb.append(", clientIdCallback=null, logger=");
        sb.append(this.c);
        sb.append(", additionalAuthProviders=");
        r66 r66Var = r66.a;
        sb.append(r66Var);
        sb.append(", additionalPushProviders=");
        sb.append(r66Var);
        sb.append(", hostInfoProvider=");
        sb.append(this.d);
        sb.append(", topicHostInfoProvider=");
        sb.append(this.e);
        sb.append(", default=");
        sb.append(this.f);
        sb.append(", providers=");
        sb.append(this.g);
        sb.append(", testModeEnabled=false, sdkType=");
        return x05.i(sb, this.h, ')');
    }
}
