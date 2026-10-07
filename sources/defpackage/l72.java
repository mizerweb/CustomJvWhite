package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class l72 implements qv8, Serializable {
    public static final Object NO_RECEIVER = k72.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient qv8 reflected;
    private final String signature;

    public l72(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.qv8
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.qv8
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public qv8 compute() {
        qv8 qv8Var = this.reflected;
        if (qv8Var != null) {
            return qv8Var;
        }
        qv8 qv8VarComputeReflected = computeReflected();
        this.reflected = qv8VarComputeReflected;
        return qv8VarComputeReflected;
    }

    public abstract qv8 computeReflected();

    @Override // defpackage.pv8
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public sv8 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return zfe.a(cls);
        }
        zfe.a.getClass();
        return new flc(cls);
    }

    @Override // defpackage.qv8
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract qv8 getReflected();

    @Override // defpackage.qv8
    public bw8 getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.qv8
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.qv8
    public fw8 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.qv8
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.qv8
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.qv8
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
