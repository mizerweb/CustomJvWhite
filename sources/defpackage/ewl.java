package defpackage;

import com.google.android.gms.common.api.Status;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ewl {
    public static final na6 a(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr) {
        ka6 ka6Var = new ka6(str, enumArr.length);
        int length = enumArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Enum r5 = enumArr[i];
            int i3 = i2 + 1;
            String strName = (String) a.d1(strArr, i2);
            if (strName == null) {
                strName = r5.name();
            }
            ka6Var.k(strName, false);
            Annotation[] annotationArr2 = (Annotation[]) a.d1(annotationArr, i2);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    int i4 = ka6Var.d;
                    List[] listArr = ka6Var.f;
                    List arrayList = listArr[i4];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                        listArr[ka6Var.d] = arrayList;
                    }
                    arrayList.add(annotation);
                }
            }
            i++;
            i2 = i3;
        }
        na6 na6Var = new na6(str, enumArr);
        na6Var.c = ka6Var;
        return na6Var;
    }

    public static void b(Status status, Object obj, qjh qjhVar) {
        if (status.b()) {
            qjhVar.a.q(obj);
        } else {
            qjhVar.c(vd7.x(status));
        }
    }
}
