package org.jni_zero;

import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class JniUtil {
    private static Map<Object, Object> arrayToMap(Object[] objArr) {
        int length = objArr.length;
        ArrayMap arrayMap = new ArrayMap(length / 2);
        for (int i = 0; i < length; i += 2) {
            arrayMap.put(objArr[i], objArr[i + 1]);
        }
        return arrayMap;
    }

    private static Object[] mapToArray(Map<Object, Object> map) {
        Object[] objArr = new Object[map.size() * 2];
        int i = 0;
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            int i2 = i + 1;
            objArr[i] = entry.getKey();
            i += 2;
            objArr[i2] = entry.getValue();
        }
        return objArr;
    }
}
