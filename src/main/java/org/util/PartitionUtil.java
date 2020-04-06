package org.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Partitionner une liste d'éléments en liste de sous listes
 */
public class PartitionUtil {

    /**
     * Partitionner une liste en liste de sous liste
     *
     * @param list la liste à partitionner
     * @param size la taille maximum des sous liste
     * @param <T>  type générique des élément de la liste
     * @return la liste partitionnée en sous listes.
     */
    public static <T> List<List<T>> partition(List<T> list, int size) {
        if (list == null) {
            throw new IllegalArgumentException("la liste ne doit pas être nulle.");
        }
        if (size < 1) {
            throw new IllegalArgumentException("la taille doit être strictement supérieure à 0.");
        }

        List<List<T>> lists = new ArrayList<>();
        if (list.isEmpty()) {
            lists.add(list);
        } else {
            int fromIndex = 0;
            int indexTo = Math.min(fromIndex + size, list.size());
            int listSize = list.size();
            while (fromIndex < listSize && indexTo <= listSize) {
                lists.add(list.subList(fromIndex, indexTo));
                fromIndex += size;
                indexTo = Math.min(indexTo + size, listSize);
            }
        }
        return lists;
    }
}