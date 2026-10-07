package scout.exception;

import defpackage.c54;
import defpackage.hg5;
import defpackage.rl0;
import defpackage.ww3;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lscout/exception/IllegalOverridesException;", "Lscout/exception/ScoutException;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IllegalOverridesException extends ScoutException {
    public final String a;
    public final Set b;

    public IllegalOverridesException(String str, ArrayList arrayList) {
        this.a = str;
        this.b = ww3.X1(arrayList);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0040  */
    @Override // java.lang.Throwable
    public final String getMessage() {
        Object objValueOf;
        int size = this.b.size();
        String str = this.a;
        Set set = this.b;
        if (size != 1) {
            String strLineSeparator = System.lineSeparator();
            StringBuilder sb = new StringBuilder("Multiple object factories already exist in ");
            sb.append("Scope(name=\"" + str + "\")");
            sb.append(" and overrides are not allowed:");
            sb.append(System.lineSeparator());
            return ww3.z1(set, strLineSeparator, sb.toString(), null, rl0.h, 28);
        }
        StringBuilder sb2 = new StringBuilder("Object factory for ");
        int iIntValue = ((Number) ww3.q1(set)).intValue();
        StringBuilder sb3 = new StringBuilder("Object(type=");
        c54 c54VarA = hg5.a();
        if (c54VarA != null) {
            c54VarA.a();
            objValueOf = (String) c54VarA.b.get(Integer.valueOf(iIntValue));
            if (objValueOf == null) {
                objValueOf = Integer.valueOf(iIntValue);
            }
        } else {
            objValueOf = Integer.valueOf(iIntValue);
        }
        sb3.append(objValueOf);
        sb3.append(')');
        sb2.append(sb3.toString());
        sb2.append(" already exist in ");
        sb2.append("Scope(name=\"" + str + "\")");
        sb2.append(" and override is not allowed");
        return sb2.toString();
    }
}
