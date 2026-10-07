package scout;

import defpackage.cqk;
import defpackage.h5;
import defpackage.ny8;
import defpackage.r3f;
import defpackage.wwd;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0007\u001a\u00028\u0000\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0001H\u0084\b¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0001H\u0084\b¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0001H\u0084\b¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0001H\u0084\b¢\u0006\u0004\b\u000f\u0010\bJ$\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0001H\u0084\b¢\u0006\u0004\b\u0010\u0010\u000bJ$\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0001H\u0084\b¢\u0006\u0004\b\u0011\u0010\u000eJ,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0084\b¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\t\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0084\b¢\u0006\u0004\b\u0017\u0010\u0018J2\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\f\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0084\b¢\u0006\u0004\b\u0019\u0010\u001aJ>\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\"\n\b\u0000\u0010\u001b\u0018\u0001*\u00020\u0001\"\n\b\u0001\u0010\u001c\u0018\u0001*\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0084\b¢\u0006\u0004\b\u001e\u0010\u001fJD\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d0\t\"\n\b\u0000\u0010\u001b\u0018\u0001*\u00020\u0001\"\n\b\u0001\u0010\u001c\u0018\u0001*\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0084\b¢\u0006\u0004\b \u0010\u0018JD\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d0\f\"\n\b\u0000\u0010\u001b\u0018\u0001*\u00020\u0001\"\n\b\u0001\u0010\u001c\u0018\u0001*\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0084\b¢\u0006\u0004\b!\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R \u0010&\u001a\u00020%8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lscout/Component;", "", "Lr3f;", "scope", "<init>", "(Lr3f;)V", "T", "get", "()Ljava/lang/Object;", "Lny8;", "getLazy", "()Lny8;", "Lwwd;", "getProvider", "()Lwwd;", "opt", "optLazy", "optProvider", "", "nonEmpty", "", "collect", "(Z)Ljava/util/List;", "collectLazy", "(Z)Lny8;", "collectProvider", "(Z)Lwwd;", "K", "V", "", "associate", "(Z)Ljava/util/Map;", "associateLazy", "associateProvider", "Lr3f;", "getScope", "()Lr3f;", "Lh5;", "accessor", "Lh5;", "getAccessor", "()Lh5;", "getAccessor$annotations", "()V", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Component {
    private final h5 accessor;
    private final r3f scope;

    public Component(r3f r3fVar) {
        this.scope = r3fVar;
        this.accessor = r3fVar.g;
    }

    public static /* synthetic */ Map associate$default(Component component, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: associate");
        }
        component.getAccessor();
        cqk.F();
        throw null;
    }

    public static /* synthetic */ ny8 associateLazy$default(Component component, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: associateLazy");
        }
        component.getAccessor();
        cqk.F();
        throw null;
    }

    public static /* synthetic */ wwd associateProvider$default(Component component, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: associateProvider");
        }
        component.getAccessor();
        cqk.F();
        throw null;
    }

    public static /* synthetic */ List collect$default(Component component, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collect");
        }
        component.getAccessor();
        cqk.F();
        throw null;
    }

    public static /* synthetic */ ny8 collectLazy$default(Component component, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collectLazy");
        }
        component.getAccessor();
        cqk.F();
        throw null;
    }

    public static /* synthetic */ wwd collectProvider$default(Component component, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collectProvider");
        }
        component.getAccessor();
        cqk.F();
        throw null;
    }

    public static /* synthetic */ void getAccessor$annotations() {
    }

    public final /* synthetic */ <K, V> Map<K, V> associate(boolean nonEmpty) {
        getAccessor();
        cqk.F();
        throw null;
    }

    public final /* synthetic */ <K, V> ny8 associateLazy(boolean nonEmpty) {
        getAccessor();
        cqk.F();
        throw null;
    }

    public final /* synthetic */ <K, V> wwd associateProvider(boolean nonEmpty) {
        getAccessor();
        cqk.F();
        throw null;
    }

    public final /* synthetic */ <T> List<T> collect(boolean nonEmpty) {
        getAccessor();
        cqk.F();
        throw null;
    }

    public final /* synthetic */ <T> ny8 collectLazy(boolean nonEmpty) {
        getAccessor();
        cqk.F();
        throw null;
    }

    public final /* synthetic */ <T> wwd collectProvider(boolean nonEmpty) {
        getAccessor();
        cqk.F();
        throw null;
    }

    public final /* synthetic */ <T> T get() {
        getAccessor();
        cqk.F();
        throw null;
    }

    public final h5 getAccessor() {
        return this.accessor;
    }

    public final /* synthetic */ <T> ny8 getLazy() {
        getAccessor();
        cqk.F();
        throw null;
    }

    public final /* synthetic */ <T> wwd getProvider() {
        getAccessor();
        cqk.F();
        throw null;
    }

    public final r3f getScope() {
        return this.scope;
    }

    public final /* synthetic */ <T> T opt() {
        getAccessor();
        cqk.F();
        throw null;
    }

    public final /* synthetic */ <T> ny8 optLazy() {
        getAccessor();
        cqk.F();
        throw null;
    }

    public final /* synthetic */ <T> wwd optProvider() {
        getAccessor();
        cqk.F();
        throw null;
    }
}
