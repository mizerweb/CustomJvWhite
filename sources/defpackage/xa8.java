package defpackage;

import android.util.Size;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Comparator;
import java.util.Map;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class xa8 implements Comparator {
    public final /* synthetic */ int a;

    public xa8(xpf xpfVar) {
        this.a = 27;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ble bleVar;
        b87 b87Var;
        ble bleVar2;
        b87 b87Var2;
        Long lValueOf;
        Comparable comparableValueOf = null;
        switch (this.a) {
            case 0:
                return e9i.D(Long.valueOf(((kb9) obj2).e), Long.valueOf(((kb9) obj).e));
            case 1:
                return e9i.D(Long.valueOf(((kb9) obj2).e), Long.valueOf(((kb9) obj).e));
            case 2:
                return e9i.D(Long.valueOf(((kb9) obj2).e), Long.valueOf(((kb9) obj).e));
            case 3:
                return e9i.D(Long.valueOf(((kb9) obj2).e), Long.valueOf(((kb9) obj).e));
            case 4:
                return e9i.D(Long.valueOf(((be9) obj).a), Long.valueOf(((be9) obj2).a));
            case 5:
                return e9i.D(Long.valueOf(((pba) obj).a), Long.valueOf(((pba) obj2).a));
            case 6:
                return e9i.D((Long) ((ylc) obj2).b, (Long) ((ylc) obj).b);
            case 7:
                return e9i.D(Long.valueOf(((d83) obj2).m), Long.valueOf(((d83) obj).m));
            case 8:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return e9i.D(Long.valueOf(((long) size.getWidth()) * ((long) size.getHeight())), Long.valueOf(((long) size2.getWidth()) * ((long) size2.getHeight())));
            case 9:
                return e9i.D(Long.valueOf(((xn6) obj).g), Long.valueOf(((xn6) obj2).g));
            case 10:
                return e9i.D(((File) obj2).getName(), ((File) obj).getName());
            case 11:
                return e9i.D(((File) obj).getName(), ((File) obj2).getName());
            case 12:
                o95 o95Var = (o95) obj2;
                Integer numValueOf = (o95Var == null || (bleVar2 = o95Var.b) == null || (b87Var2 = bleVar2.a) == null) ? null : Integer.valueOf(b87Var2.j);
                o95 o95Var2 = (o95) obj;
                if (o95Var2 != null && (bleVar = o95Var2.b) != null && (b87Var = bleVar.a) != null) {
                    comparableValueOf = Integer.valueOf(b87Var.j);
                }
                return e9i.D(numValueOf, comparableValueOf);
            case 13:
                return e9i.D(Integer.valueOf((int) (((bj8) obj2).a & 4294967295L)), Integer.valueOf((int) (((bj8) obj).a & 4294967295L)));
            case 14:
                return cqk.i((int) (((bj8) obj).a & 4294967295L), (int) (((bj8) obj2).a & 4294967295L));
            case 15:
                return e9i.D(Integer.valueOf(((xpc) obj).b), Integer.valueOf(((xpc) obj2).b));
            case 16:
                return e9i.D(Integer.valueOf(((xpc) obj).b), Integer.valueOf(((xpc) obj2).b));
            case 17:
                return e9i.D(Boolean.valueOf(((ek4) obj2).h), Boolean.valueOf(((ek4) obj).h));
            case 18:
                return e9i.D(((i5d) obj).a, ((i5d) obj2).a);
            case 19:
                return e9i.D((Long) ((ylc) obj2).b, (Long) ((ylc) obj).b);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return e9i.D(Integer.valueOf(((y0e) obj).b), Integer.valueOf(((y0e) obj2).b));
            case 21:
                return e9i.D(Long.valueOf(((rt2) obj2).b.b0), Long.valueOf(((rt2) obj).b.b0));
            case 22:
                return e9i.D((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 23:
                return e9i.D((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 24:
                rt2 rt2Var = ((f9f) obj2).d;
                Long lValueOf2 = rt2Var != null ? Long.valueOf(rt2Var.x()) : null;
                rt2 rt2Var2 = ((f9f) obj).d;
                return e9i.D(lValueOf2, rt2Var2 != null ? Long.valueOf(rt2Var2.x()) : null);
            case 25:
                Long lValueOf3 = Long.valueOf(BuildConfig.MAX_TIME_TO_UPLOAD);
                f9f f9fVar = (f9f) obj2;
                rt2 rt2Var3 = f9fVar.d;
                if (rt2Var3 == null || !rt2Var3.y0()) {
                    rt2 rt2Var4 = f9fVar.d;
                    lValueOf = rt2Var4 != null ? Long.valueOf(rt2Var4.x()) : null;
                } else {
                    lValueOf = lValueOf3;
                }
                f9f f9fVar2 = (f9f) obj;
                rt2 rt2Var5 = f9fVar2.d;
                if (rt2Var5 == null || !rt2Var5.y0()) {
                    rt2 rt2Var6 = f9fVar2.d;
                    if (rt2Var6 != null) {
                        comparableValueOf = Long.valueOf(rt2Var6.x());
                    }
                } else {
                    comparableValueOf = lValueOf3;
                }
                return e9i.D(lValueOf, comparableValueOf);
            case 26:
                return e9i.D(Long.valueOf(((rt2) obj2).x()), Long.valueOf(((rt2) obj).x()));
            case 27:
                return e9i.D(Long.valueOf(Files.readAttributes(Paths.get(((File) obj).getAbsolutePath(), new String[0]), BasicFileAttributes.class, new LinkOption[0]).creationTime().toMillis()), Long.valueOf(Files.readAttributes(Paths.get(((File) obj2).getAbsolutePath(), new String[0]), BasicFileAttributes.class, new LinkOption[0]).creationTime().toMillis()));
            case 28:
                return e9i.D(Long.valueOf(((r71) obj2).b), Long.valueOf(((r71) obj).b));
            default:
                return e9i.D(Boolean.valueOf(!((omg) obj).h), Boolean.valueOf(!((omg) obj2).h));
        }
    }

    public /* synthetic */ xa8(int i) {
        this.a = i;
    }
}
