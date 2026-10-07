package defpackage;

import android.database.SQLException;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class aql {
    public static final bz8 a(int i) {
        return new bz8(i, 0, 6);
    }

    public static final void b(qxe qxeVar) {
        c79 c79VarW = yab.w();
        vxe vxeVarO0 = qxeVar.O0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (vxeVarO0.M0()) {
            try {
                c79VarW.add(vxeVarO0.B0(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p90.f(vxeVarO0, th);
                    throw th2;
                }
            }
        }
        p90.f(vxeVarO0, null);
        ListIterator listIterator = yab.j(c79VarW).listIterator(0);
        while (true) {
            b79 b79Var = (b79) listIterator;
            if (!b79Var.hasNext()) {
                return;
            }
            String str = (String) b79Var.next();
            if (z5h.K0(str, "room_fts_content_sync_", false)) {
                n1g.u(qxeVar, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static final void c(qxe qxeVar) {
        vxe vxeVarO0 = qxeVar.O0("PRAGMA foreign_key_check(`messages`)");
        try {
            if (vxeVarO0.M0()) {
                throw new SQLException(d(vxeVarO0));
            }
            p90.f(vxeVarO0, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p90.f(vxeVarO0, th);
                throw th2;
            }
        }
    }

    public static final String d(vxe vxeVar) {
        StringBuilder sb = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        do {
            if (i == 0) {
                sb.append("Foreign key violation(s) detected in '");
                sb.append(vxeVar.B0(0));
                sb.append("'.\n");
            }
            String strB0 = vxeVar.B0(3);
            if (!linkedHashMap.containsKey(strB0)) {
                linkedHashMap.put(strB0, vxeVar.B0(2));
            }
            i++;
        } while (vxeVar.M0());
        sb.append("Number of different violations discovered: ");
        sb.append(linkedHashMap.keySet().size());
        sb.append("\nNumber of rows in violation: ");
        sb.append(i);
        sb.append("\nViolation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            nbh.G(sb, "\tParent Table = ", (String) entry.getValue(), ", Foreign Key Constraint Index = ", (String) entry.getKey());
            sb.append("\n");
        }
        return sb.toString();
    }
}
