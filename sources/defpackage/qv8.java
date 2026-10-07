package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface qv8 extends pv8 {
    Object call(Object... objArr);

    Object callBy(Map map);

    List getParameters();

    bw8 getReturnType();

    List getTypeParameters();

    fw8 getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();
}
