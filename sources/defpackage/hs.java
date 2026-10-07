package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hs {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        wo4 ft0Var;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                ft0Var = new ft0(clipData, 3);
            } else {
                xo4 xo4Var = new xo4();
                xo4Var.b = clipData;
                xo4Var.c = 3;
                ft0Var = xo4Var;
            }
            i7j.h(textView, ft0Var.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        wo4 ft0Var;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            ft0Var = new ft0(clipData, 3);
        } else {
            xo4 xo4Var = new xo4();
            xo4Var.b = clipData;
            xo4Var.c = 3;
            ft0Var = xo4Var;
        }
        i7j.h(view, ft0Var.build());
        return true;
    }
}
