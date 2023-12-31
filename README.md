# Алгоритмы и Задачи на Java

## Теория

**Жадный алгоритм**

1. Код Хаффмана

**Деревья**

1. BST - Двоичное дерево поиска
    - добавление и удаление реализовано просто и сложность достигает O(n)
        - требуется доработка для поддержки сбалансированного состояния
    - другие операции O(log(n))
2. DFS - Обход в глубину
    - LCA Наименьший общий предок (использует DFS)
        - Сложность: O(E), но можно лучше с учетом дерева отрезков или разряженной таблицы
3. BFS - Обход в ширину

## Практика

### Задачи из книжек / курсов

**Описание задач:** [задачи](docs/tasks/Задачи.md)

**Жадный алгоритм**

1. Задача на монеты
2. Задача про непересекающиеся сегменты
    - Добавлен перебор + стресс тест

### Leetcode

|    №     |                        Название                         | Сложность |                      Заметки                       |       Теги        |
|:--------:|:-------------------------------------------------------:|:---------:|:--------------------------------------------------:|:-----------------:|
|  **94**  |              Binary Tree Inorder Traversal              |   Easy    |        Проход BinSearch в обратном порядке         |     BinSearch     |
|          |                                                         |           |                                                    |                   |
|          |                                                         |           |                                                    |                   |
| **377**  |                   Combination Sum IV                    |  Medium   |  Собрать число N используя монетки (перестановка)  |        DP         |
|          |                                                         |           |                                                    |                   |
| **1282** |  Group the People Given the Group Size They Belong To   |  Medium   | просто разложение по hashMap с учетом переполнения |      HashMap      |
| **1302** |                   Deepest Leaves Sum                    |  Medium   |      Найти все листья, static коварная штука       |        DFS        |
| **1337** |             The K Weakest Rows in a Matrix              |   Easy    |         Проходка матрицы + Comparator Pair         |      Matrix       |
|          |                                                         |           |                                                    |                   |
| **1351** |        Count Negative Numbers in a Sorted Matrix        |   Easy    |       Или пройтись по матрице или bin search       | Matrix, BinSearch |
| **1359** |       Count All Valid Pickup and Delivery Options       |   Hard    |      Правильная скобочная последовательность       |     DP, Math      |
|          |                                                         |           |                                                    |                   |
|          |                                                         |           |                                                    |                   |
|          |                                                         |           |                                                    |                   |
|          |                                                         |           |                                                    |                   |
| **1647** | Minimum Deletions to Make Character Frequencies Unique  |  Medium   | Распределить равные числа чтобы не было совпадений |      TreeSet      |
| **1689** | Partitioning Into Minimum Number Of Deci-Binary Numbers |  Medium   |           Работа с длинной строкой чисел           |  String, Binary   |
|          |                                                         |           |                                                    |                   |
| **2160** | Minimum Sum of Four Digit Number After Splitting Digits |   Easy    |                  Сортировка цифр                   |       Math        |
|          |                                                         |           |                                                    |                   |
### Задачи Codeforces

**Жадный алгоритм**

1. https://codeforces.com/problemset/problem/231/A
2. https://codeforces.com/problemset/problem/50/A
3. https://codeforces.com/problemset/problem/339/A  - неплохо с строками работается