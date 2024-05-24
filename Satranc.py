def initialize_board():
    board = [[" " for _ in range(8)] for _ in range(8)]
    # Siyah taşlar
    board[0] = ["r", "n", "b", "q", "k", "b", "n", "r"]
    board[1] = ["p"] * 8
    # Beyaz taşlar
    board[6] = ["P"] * 8
    board[7] = ["R", "N", "B", "Q", "K", "B", "N", "R"]
    return board

def print_board(board):
    for row in board:
        print(" ".join(row))

def get_move():
    start = input("Başlangıç pozisyonunu girin (örn: a2): ")
    end = input("Bitiş pozisyonunu girin (örn: a4): ")
    return start, end

def make_move(board, start, end):
    start_row, start_col = 8 - int(start[1]), ord(start[0]) - ord("a")
    end_row, end_col = 8 - int(end[1]), ord(end[0]) - ord("a")
    piece = board[start_row][start_col]
    board[start_row][start_col] = " "
    board[end_row][end_col] = piece
    return board


def main():
    board = initialize_board()
    print_board(board)
    
    while True:
        # Sıra beyaz oyuncuda
        print("Beyaz oyuncunun hamlesi:")
        start, end = get_move()
        board = make_move(board, start, end)
        print_board(board)
        
        # Sıra siyah oyuncuda
        print("Siyah oyuncunun hamlesi:")
        start, end = get_move()
        board = make_move(board, start, end)
        print_board(board)

if __name__ == "__main__":
    main()
