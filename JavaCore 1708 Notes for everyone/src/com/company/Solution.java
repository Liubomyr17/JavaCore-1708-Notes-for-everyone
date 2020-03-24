package com.company;

/*

1708 Notes for everyone
The Note class will be used by threads.
Therefore, make sure that the notes sheet is in shared memory, i.e. it will not be cached by streams in its local memory area.

Requirements:
1. The class Note must contain the addNote method (int index, String note).
2. The Note class must contain the removeNote (int index) method.
3. The class Note must contain the public field List notes.
4. The List notes field should not be in the local cache.


 */

import java.util.ArrayList;
import java.util.List;


public class Solution {

    public static void main(String[] args) {

    }

    public static class Note {

        public volatile List<String> notes = new ArrayList<String>();

        public void addNote(int index, String note) {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
            notes.add(index, note);
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public void removeNote(int index) {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note = notes.remove(index);
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }
    }
}





